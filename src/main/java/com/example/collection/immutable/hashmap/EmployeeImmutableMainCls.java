package com.example.collection.immutable.hashmap;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeImmutableMainCls {
	public static void main(String[] args) {
		HashMap<EmployeeImmutable, String> employeeMap = new HashMap<EmployeeImmutable, String>();
		EmployeeImmutable employee1 = EmployeeImmutable.EmployeeBuilder.anEmployee().withId(1).withName("Sachin")
				.withDateOfBirth(new Date(1987, 2, 1)).withSalary(new BigDecimal(100000)).build();
		employeeMap.put(employee1, "India");
		
		for (Map.Entry<EmployeeImmutable, String> employeeStringEntry : employeeMap.entrySet()) {
			System.out.println("hascode => Sachin = >" +employeeStringEntry.getKey().hashCode());
		}
		
		EmployeeImmutable immutableUpdatedEmployee1 = EmployeeImmutable.EmployeeBuilder.anEmployee(employee1).withName("Rahul").build();
		for (Map.Entry<EmployeeImmutable, String> employeeStringEntry : employeeMap.entrySet()) {
			System.out.println("hascode => Rahul = >" +employeeStringEntry.getKey().hashCode());
		}
		
		System.out.println(employeeMap.get(immutableUpdatedEmployee1)); 		// Returns null
		
		EmployeeImmutable employee2 = EmployeeImmutable.EmployeeBuilder.anEmployee().withId(1).withName("Sachin")
				.withDateOfBirth(new Date(1987, 2, 1)).withSalary(new BigDecimal(100000)).build();
		System.out.println("extract employee details of sachin == >" +employee2.hashCode());
		System.out.println(employeeMap.get(employee2));
		
		EmployeeImmutable employee3 = EmployeeImmutable.EmployeeBuilder.anEmployee().withId(1).withName("Rahul")
				.withDateOfBirth(new Date(1987, 2, 1)).withSalary(new BigDecimal(100000)).build();
		System.out.println("extract employee details of Rahul == >" +employee3.hashCode());
		System.out.println(employeeMap.get(employee3));
		// Now this works fine and it shall return the correct object from the HashMap
	}
}
