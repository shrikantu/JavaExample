package com.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class Student {
	private String id;
	private String name;
	private String age;

	public Student(String id, String name, String age) {
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
}

public class HashMapWithoutHashCodeExample {
	public static void main(String[] args) {
		Map<Student,Student> map = new HashMap<Student,Student>();
		for(int i = 0;i<=10;i++){
			Student student = new Student(String.valueOf(i), "abc" + i, String.valueOf(i));
			System.out.println(student.hashCode());
			map.put(student, student);
		}
		System.out.println(" ============================== ");
		for(Map.Entry<Student,Student> entry : map.entrySet()) {
			Student  student = entry.getKey();
			System.out.println(student.hashCode());
		}
	}
}