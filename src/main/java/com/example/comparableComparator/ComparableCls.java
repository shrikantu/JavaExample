package com.example.comparableComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class ComparableCls {

	public static void main(String[] args) {
		TreeSet<Student2> treeset = new TreeSet<Student2>();
		
		Student2 s1=new Student2(1, "Arpit", "M", 19);
		Student2 s2=new Student2(2, "John", "M", 17);
		Student2 s3=new Student2(3, "Mary", "F", 14);
		Student2 s4=new Student2(4, "Martin", "M", 21);
		Student2 s5=new Student2(5, "Monica", "F", 16);
		Student2 s6=new Student2(6, "Ally", "F", 20);
		Student2 s7=new Student2(6, "Zeon", "F", 24);
		
		treeset.add(s1);
		treeset.add(s2);
		treeset.add(s3);
		treeset.add(s4);
		treeset.add(s5);
		treeset.add(s6);
		treeset.add(s7);

		System.out.println(treeset);
	}

}
