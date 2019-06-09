package com.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static java.util.Arrays.asList;

public class RemoveFromCollectionCls {
	public void removeFromCollection(List<Integer> marks) {
		for (Integer mark : marks) {
			if (mark < 40)
				marks.remove(mark); // ==> Will throw java.util.ConcurrentModificationException
		}
	}

	public void removeFromCollection1(List<Integer> marks) {
		for (Iterator<Integer> iterator = marks.iterator(); iterator.hasNext();) {
			Integer mark = iterator.next();
			if (mark < 40)
				iterator.remove(); // ==> Safe to call remove() on Iterator
		}
	}


	public static void main(String[] args) {
		RemoveFromCollectionCls test = new RemoveFromCollectionCls();
		//test.removeFromCollection(new ArrayList<Integer>(asList(10, 20, 50, 60)));
		test.removeFromCollection1(new ArrayList<Integer>(asList(10, 20, 50, 60)));
	}
}
