package com.example.comparableComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class ComparableCls2 {

	public static void main(String[] args) {
		TreeSet<Student3> treeset = new TreeSet<Student3>();
		
		Student3 s1=new Student3(1, "Arpit", "M", 19);
		Student3 s2=new Student3(2, "John", "M", 17);
		Student3 s3=new Student3(3, "Mary", "F", 14);
		Student3 s4=new Student3(4, "Martin", "M", 21);
		Student3 s5=new Student3(5, "Monica", "F", 16);
		Student3 s6=new Student3(6, "Ally", "F", 20);
		
		treeset.add(s1);
		treeset.add(s2);
		treeset.add(s3);
		treeset.add(s4);
		treeset.add(s5);
		treeset.add(s6);

		System.out.println(treeset);
	}

}
