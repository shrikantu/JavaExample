package com.example.string.contentequals;

public class StringEquals {

	public static void main(String[] args) {
	EmployeeEquals e1 = new EmployeeEquals(1,"shrikant" ,"15");
	EmployeeEquals e2 = new EmployeeEquals(1,"shrikant" ,"12");
	
	System.out.println(e1.equals(e2));

	}

}
