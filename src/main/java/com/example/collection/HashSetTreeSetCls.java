package com.example.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTreeSetCls {

	/**
	 * HashSet allows null object but TreeSet doesn't allow null Object and throw NullPointerException, 
	 * Why, because TreeSet uses compareTo() method to compare keys and compareTo() will throw java.lang.NullPointerException
	 * @param args
	 */
	
	public static void main(String[] args) {
		Set<String> hashset = new HashSet<String>();
		Set<String> treeset = new TreeSet<String>();

		hashset.add(null);
		System.out.println(hashset);
		
		treeset.add(null);
		System.out.println(treeset);
	}

}
