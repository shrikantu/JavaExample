package com.example.collection;

/**
 *  
 *  Create a int result and assign a non-zero value.
 *For every field f tested in the equals() method, calculate a hash code c by:

 *If the field f is a boolean: calculate (f ? 0 : 1);
 *If the field f is a byte, char, short or int: calculate (int)f;
 *If the field f is a long: calculate (int)(f ^ (f >>> 32));
 *If the field f is a float: calculate Float.floatToIntBits(f);
 *If the field f is a double: calculate Double.doubleToLongBits(f) and handle the return value like every long value;
 *If the field f is an object: Use the result of the hashCode() method or 0 if f == null;
 *If the field f is an array: see every field as separate element and calculate the hash value in a recursive fashion and combine the values as described next.
 *Combine the hash value c with result:

 *result = 37 * result + c
 *Return result

 *  
 *  Primes are unique numbers. They are unique in that, the product of a prime with any 
 *  other number has the best chance of being unique (not as unique as the prime itself of-course) 
 *  due to the fact that a prime is used to compose it. This property is used in hashing functions.
 *  
 *  
 */

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Employee {
	private long id;
	private String name;
	private float age;
	private Date dob;
	private double salary;
	private short number;
	private byte byteNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public short getNumber() {
		return number;
	}

	public void setNumber(short number) {
		this.number = number;
	}

	public byte getByteNumber() {
		return byteNumber;
	}

	public void setByteNumber(byte byteNumber) {
		this.byteNumber = byteNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(age);
		result = prime * result + byteNumber;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Float.floatToIntBits(age) != Float.floatToIntBits(other.age))
			return false;
		if (byteNumber != other.byteNumber)
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

}

public class HashCodeExample {
	public static void main(String args[]) {
		Map map = new HashMap();

		Employee e1 = new Employee();
		e1.setAge(20);
		e1.setId(101);
		e1.setName("sh");
		map.put(e1, e1);

		Employee e2 = new Employee();
		e2.setAge(20);
		e2.setId(101);
		e2.setName("sh");
		map.put(e2, e2);

		System.out.println(" e1 hascode " + e1.hashCode());
		System.out.println(" e2 hascode " + e2.hashCode());

		if (e1.equals(e2)) {
			System.out.println(" true ");
		} else {
			System.out.println(" false ");
		}
	}

}
