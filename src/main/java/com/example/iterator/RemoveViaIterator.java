package com.example.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveViaIterator {
	private String [] a  = {"1st", "2nd", "3rd", "4th"};
	private List<String> names = new ArrayList<String>(Arrays.asList(a));


	public void remove() {
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println("next = " + next);
			iterator.remove();
		}
		System.out.println(names.size());
	}

	public static void main(String[] args) {
		RemoveViaIterator test = new RemoveViaIterator();
		test.remove();
	}
}
