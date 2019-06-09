package com.example.comparableComparator;

import java.util.Comparator;

public class Student2 implements Comparable<Student2>{

	private int id;
	private String name;
	private String gender;
	private int age;

	public Student2(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student2 o) {
		if(o.getName().compareTo(this.getName()) >0) return 1;
		else if(o.getName().compareTo(this.getName()) <0) return -1;
		else return 0;
	}

}