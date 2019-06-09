package com.example.collection.immutable.hashmap;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

public class EmployeeWOMainCls {
	public static void main(String[] args) {
		HashMap<EmployeeWOHahsCodeEquals, String> employeeMap = new HashMap<EmployeeWOHahsCodeEquals, String>();
		EmployeeWOHahsCodeEquals employee1 = new EmployeeWOHahsCodeEquals();
		employee1.setId(1);
		employee1.setName("Sachin");
		employee1.setDateOfBirth(new Date(1987, 2, 1));
		employee1.setSalary(new BigDecimal(100000));
		employeeMap.put(employee1, "India");
		// Some Business logic
		// In the second Operation I am updating the same employee with the newly
		// initailized Employee Object
		EmployeeWOHahsCodeEquals employee2 = new EmployeeWOHahsCodeEquals();
		employee2.setId(1);
		employee2.setName("Sachin");
		employee2.setDateOfBirth(new Date(1987, 2, 1));
		employee2.setSalary(new BigDecimal(100000));
		// Here we wanted to update the same Employee to Japan
		employeeMap.put(employee2, "Japan");
		
		EmployeeWOHahsCodeEquals employee3 = new EmployeeWOHahsCodeEquals();
		employee3.setId(1);
		employee3.setName("Sachin");
		employee3.setDateOfBirth(new Date(1987, 2, 1));
		employee3.setSalary(new BigDecimal(100000));
		// Here we wanted to update the same Employee to Japan
		employeeMap.put(employee3, "Singapore");
		System.out.println(employeeMap);
		// Output of this will be 2 as below
		/*
		 * {Employee{id=1, name='Sachin', dateOfBirth=Tue Mar 01 00:00:00 IST 3887,
		 * salary=100000}=Japan, Employee{id=1, name='Sachin', dateOfBirth=Tue Mar 01
		 * 00:00:00 IST 3887, salary=100000}=India}
		 */
		System.out.println(employeeMap.get(employee1));
		System.out.println(employeeMap.get(employee2));
		System.out.println(employeeMap.get(employee3));
	}

}
