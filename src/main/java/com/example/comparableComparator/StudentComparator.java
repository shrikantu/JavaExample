package com.example.comparableComparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	public StudentComparator() {
	}

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getName().compareTo(o2.getName()) > 0)
			return 1;
		else if (o1.getName().compareTo(o2.getName()) < 0)
			return -1;
		else {
			if (o1.getGender().compareTo(o2.getGender()) > 0) {
				return 1;
			} else if (o1.getGender().compareTo(o2.getGender()) < 0) {
				return -1;
			} else {
				return 0;
			}
		}

	}

}
