package com.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class Employee1 {
	private String id;
	private String name;
	private String age;

	public Employee1(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee1 other = (Employee1) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class HashMapWithHashCodeExample {
	public static void main(String[] args) {
		Map<Employee1,Employee1> map = new HashMap<Employee1,Employee1>();
		for(int i = 0;i<=10;i++){
			Employee1 student = new Employee1(String.valueOf(i), "abc" + i, String.valueOf(i));
			System.out.println(student.hashCode());
			map.put(student, student);
		}
		System.out.println(" ============================== ");
		for(Map.Entry<Employee1,Employee1> entry : map.entrySet()) {
			Employee1  student = entry.getKey();
			System.out.println(student.hashCode());
		}
	}
}