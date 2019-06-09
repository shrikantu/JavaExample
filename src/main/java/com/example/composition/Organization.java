package com.example.composition;

import java.util.ArrayList;
import java.util.List;

public class Organization {
	private final List<Department> departments;

	public Organization() {
		departments = new ArrayList<Department>();
		departments.add(new Department("Finance"));
		departments.add(new Department("HR"));
		departments.add(new Department("Technical"));
	}
	
	public static void main () {
		Organization org = new Organization();
		
	}
}

class Department {
	private final String name;

	Department(String name) {
		this.name = name;
	}
}
