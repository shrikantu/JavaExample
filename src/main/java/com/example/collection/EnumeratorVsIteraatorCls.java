package com.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/**
 * Enumeration interface:
 * 
 * Use this cursor only with legacy collection, to work with thread-safe
 * environment
 * 
 * Iterator interface:
 * 
 * This is very popular among 3 cursors, as it is applicable for any collection
 * class
 * 
 * ListIterator interface:
 * 
 * Again, this is applicable only for List objects. Use this cursor, to benefit
 * from iterating through List items in both directions i.e.; both FORWARD &
 * BACKWARD directions
 * 
 * 2) remove() method
 * 
 * This is the main difference between Enumeration and Iterator interface.
 * Enumeration only traverses the Collection object. You can’t do any
 * modifications to Collection while traversing the Collection using
 * Enumeration.
 * 
 *  Where as Iterator interface allows us to remove an element while
 * traversing the Collection object. Iterator has remove() method which is not
 * there in the Enumeration interface. Below is the list of Enumeration and
 * Iterator methods.
 * 
 * 3) Legacy Interface
 * 
 * Enumeration is a legacy interface used to traverse only the legacy classes
 * like Vector, HashTable and Stack. Where as Iterator is not a legacy code
 * which is used to traverse most of the classes in the collection framework.
 * For example, ArrayList, LinkedList, HashSet, LinkedHashSet, TreeSet, HashMap,
 * LinkedHashMap, TreeMap etc.
 * 
 * 4) Fail-Fast Vs Fail-Safe
 * 
 * Iterator is a fail-fast in nature. i.e it throws
 * ConcurrentModificationException if a collection is modified while iterating
 * other than it’s own remove() method. Where as Enumeration is fail-safe in
 * nature. It doesn’t throw any exceptions if a collection is modified while
 * iterating. 
 * 
 * 5) Safe And Secure
 * 
 * As Iterator is fail-fast in nature and doesn’t allow modification of a
 * collection by other threads while iterating, it is considered as safe and
 * secure than Enumeration.
 * 
 * 
 * 
 * @author Shrikant
 *
 */

public class EnumeratorVsIteraatorCls {

	public static Map<Integer, String> map = null;

	public static void main(String[] args) {
		vectorOperation();
		// arrayListOperation();
	}

	private static void vectorOperation() {

		Vector<String> vector = new Vector<String>();
		vector.add("1");
		vector.add("2");
		vector.add("3");
		vector.add("4");
		vector.add("5");
		vector.add("6");
		vector.add("7");
		vector.add("8");
		vector.add("9");
		vector.add("10");

		try {
			Enumeration<String> enumeration = vector.elements();
			while (enumeration.hasMoreElements()) {
				System.out.println(enumeration.nextElement());
				vector.remove("10");
			}

			vector.add("10");
			Iterator<String> iterator = vector.iterator();
			while (iterator.hasNext()) {

				// vector.remove("10");
				iterator.remove();
				// System.out.println(iterator.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void arrayListOperation() {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		arrayList.add("6");
		arrayList.add("7");
		arrayList.add("8");
		arrayList.add("9");
		arrayList.add("10");

		try {
			Enumeration<String> enumeration = arrayList.
			while (enumeration.hasMoreElements()) {
				System.out.println(enumeration.nextElement());
				arrayList.remove("10");
			}

			arrayList.add("10");
			Iterator<String> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				arrayList.remove("10");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}