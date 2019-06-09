package com.example.collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorArrayListSizeCls {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		ArrayList<String> arrayList = new ArrayList<String>();
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
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

		System.out.println("vec size "+vector.size());
		System.out.println(vector.capacity());
		
		System.out.println(arrayList.size());
		
		
		vector.add("11");
		arrayList.add("11");
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		System.out.println(arrayList.size());
		arrayList.trimToSize();
		System.out.println(arrayList.size());
	}

}
