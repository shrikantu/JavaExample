package com.example.collection.listcompare;

import java.util.ArrayList;
import java.util.List;



/**
 * Hello world!
 *
 */
public class ListCompare {
	public static void main(String[] args) {
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee(1));
		list1.add(new Employee(2));
		list1.add(new Employee(3));
		list1.add(new Employee(4));
		list1.add(new Employee(5));

		List<Employee> list2 = new ArrayList<Employee>();
		list2.add(new Employee(1));
		list2.add(new Employee(2));
		

		listCompare(list1, list2);
	}

	public static void listCompare(final List<Employee> list1, final List<Employee> list2) {
		list1.removeAll(list2);
		System.out.println(list1);
		
		list2.removeAll(list1);
		System.out.println(list2);

	}
}
