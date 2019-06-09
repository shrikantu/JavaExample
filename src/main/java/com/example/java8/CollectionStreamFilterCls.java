package com.example.java8;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreamFilterCls {

	public static void main(String[] args)
	{	
		List<Student> studentList=createStudentList();	
		Stream students = studentList.stream().map(Student::getName);
		students.forEach(s-> System.out.println(s));
		
		List<Student> maleStudents = studentList.stream()
				.filter(s->s.getGender().equalsIgnoreCase("F"))
				.filter(s->s.getAge() < 20)
				.collect(Collectors.toList());
		System.out.println(maleStudents);
		
	}
 
	public static List createStudentList()
	{
		List studentList=new ArrayList();
		Student s1=new Student(1, "Arpit", "M", 19);
		Student s2=new Student(2, "John", "M", 17);
		Student s3=new Student(3, "Mary", "F", 14);
		Student s4=new Student(4, "Martin", "M", 21);
		Student s5=new Student(5, "Monica", "F", 16);
		Student s6=new Student(6, "Ally", "F", 20);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		return studentList;
	}

}
