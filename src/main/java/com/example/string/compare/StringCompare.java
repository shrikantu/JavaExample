package com.example.string.compare;

public class StringCompare {

	public static void main(String[] args) {
		EmployeeCompare e1 = new EmployeeCompare(1, "shrikant", "15");
		EmployeeCompare e2 = new EmployeeCompare(1, "shrikant", "12");

		System.out.println(e1.compareTo(e2));

		EmployeeCompare e3 = new EmployeeCompare(1, "shrikant", "15");    // shrikant is in lower case
		EmployeeCompare e4 = new EmployeeCompare(1, "Shrikant", "12");    // shrikant is in upper case

		System.out.println(e3.compareTo(e4));

	}

}
