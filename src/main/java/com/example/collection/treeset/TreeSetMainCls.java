package com.example.collection.treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.example.comparableComparator.Student2;

public class TreeSetMainCls {

	/**
	 *  One more difference between HashSet and TreeSet 
	 *  which is worth remembering is that HashSet uses equals() method to compare two object in Set and for 
	 *  detecting duplicates while TreeSet uses compareTo() method for same purpose.
	 *  if equals() and compareTo() are not consistent,
	 *  i.e. for two equal object equals should return true while compareTo() should return zero, 
	 *  than it will break contract of Set interface and will allow duplicates in Set implementations like TreeSet
	 * @param args
	 */
	
	public static void main(String[] args) {
		Set<Student> hashset = new HashSet<Student>();
		Set<Student> treeset = new TreeSet<Student>();
		
		
		Student s1=new Student(1, "Arpit", "M", 19);
		Student s2=new Student(2, "John", "M", 17);
		Student s3=new Student(3, "Mary", "F", 14);
		Student s4=new Student(4, "Martin", "M", 21);
		Student s5=new Student(5, "Monica", "F", 16);
		Student s6=new Student(6, "Ally", "F", 20);
		Student s7=new Student(7, "Zeon", "F", 24);
		
		treeset.add(s1);
		treeset.add(s2);
		treeset.add(s3);
		treeset.add(s4);
		treeset.add(s5);
		treeset.add(s6);
		treeset.add(s7);

		hashset.add(s1);
		hashset.add(s2);
		hashset.add(s3);
		hashset.add(s4);
		hashset.add(s5);
		hashset.add(s6);
		hashset.add(s7);
		
		System.out.println("hashset" +hashset);
		System.out.println("treeset" +treeset);
	}

}
