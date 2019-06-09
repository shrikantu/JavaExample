package com.example.iterator;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * We are writing an API which will accept a Collection<Integer> as an argument
 * and duplicate an element in the Original Collection if certain criteria in
 * met. How would you code such an API method
 * 
 * @author Shrikant
 *
 */
public class AddInCollectionCls {
	public void addIntoCollection(LinkedList<Integer> marks) {
		for (ListIterator<Integer> iterator = marks.listIterator(); iterator.hasNext();) {
			Integer mark = iterator.next();
			if (mark < 40)
				iterator.add(mark);
		}
		System.out.println("marks = " + marks);
	}
	
	public static void main(String[] args) {
		AddInCollectionCls test = new AddInCollectionCls();
		//test.removeFromCollection(new ArrayList<Integer>(asList(10, 20, 50, 60)));
		test.addIntoCollection(new LinkedList<Integer>(asList(10, 20, 50, 60)));
	}
}
