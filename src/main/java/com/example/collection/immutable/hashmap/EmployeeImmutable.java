package com.example.collection.immutable.hashmap;

import java.math.BigDecimal;
import java.util.Date;

public class EmployeeImmutable {
	private final long id;
	private final String name;
	private final Date dateOfBirth;
	private final BigDecimal salary;

	public EmployeeImmutable(EmployeeBuilder employeeBuilder) {
		this.id = employeeBuilder.id;
		this.name = employeeBuilder.name;
		this.dateOfBirth = employeeBuilder.dateOfBirth;
		this.salary = employeeBuilder.salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		EmployeeImmutable employee = (EmployeeImmutable) o;
		if (id != employee.id)
			return false;
		if (name != null ? !name.equals(employee.name) : employee.name != null)
			return false;
		if (dateOfBirth != null ? !dateOfBirth.equals(employee.dateOfBirth) : employee.dateOfBirth != null)
			return false;
		return salary != null ? salary.equals(employee.salary) : employee.salary == null;
	}

	@Override
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
		result = 31 * result + (salary != null ? salary.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", dateOfBirth=" + dateOfBirth + ", salary="
				+ salary + '}';
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDateOfBirth() {
		return (Date) dateOfBirth.clone();
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public static final class EmployeeBuilder {
		private long id;
		private String name;
		private Date dateOfBirth;
		private BigDecimal salary;

		private EmployeeBuilder() {
		}

		public static EmployeeBuilder anEmployee() {
			return new EmployeeBuilder();
		}

		public static EmployeeBuilder anEmployee(EmployeeImmutable employee) {
			return anEmployee().withId(employee.getId()).withName(employee.getName())
					.withDateOfBirth(employee.getDateOfBirth()).withSalary(employee.getSalary());
		}

		public EmployeeBuilder withId(long id) {
			this.id = id;
			return this;
		}

		public EmployeeBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public EmployeeBuilder withDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public EmployeeBuilder withSalary(BigDecimal salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeImmutable build() {
			return new EmployeeImmutable(this);
		}
	}
}
