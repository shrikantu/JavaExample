package com.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapToArrayListCls {
	
	public static Map<Integer,String> map = new HashMap<Integer,String>();

	public static void main(String[] args) {
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(100, "Hundred");
		
		ArrayList arl = new ArrayList();
		arl.addAll(map.entrySet());

	System.out.println( arl);
	}

}
