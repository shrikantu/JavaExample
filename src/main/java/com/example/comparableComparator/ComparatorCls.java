package com.example.comparableComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class ComparatorCls {

	public static void main(String[] args) {
		TreeSet<Student> treeset = new TreeSet<Student>(new StudentComparator());
		
		Student s1=new Student(1, "Arpit", "M", 19);
		Student s2=new Student(2, "John", "M", 17);
		Student s3=new Student(3, "Mary", "F", 14);
		Student s4=new Student(4, "Martin", "M", 21);
		Student s5=new Student(5, "Monica", "F", 16);
		Student s6=new Student(6, "Ally", "F", 20);
		
		treeset.add(s1);
		treeset.add(s2);
		treeset.add(s3);
		treeset.add(s4);
		treeset.add(s5);
		treeset.add(s6);

		System.out.println(treeset);
	}

}
