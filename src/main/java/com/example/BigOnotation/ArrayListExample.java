package com.example.BigOnotation;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String rgs[]) {
		ArrayList<String> arl = new ArrayList<String>();
		System.out.println("before time" + System.currentTimeMillis());
		arl.add("abc1");
		arl.add("abc2");
		arl.add("abc3");
		arl.add("abc4");
		arl.add("abc5");
		arl.add("abc6");
		arl.add("abc7");
		arl.add("abc8");
		arl.add("abc9");
		arl.add("abc10");
		arl.add("abc11");
		System.out.println("after time" + System.currentTimeMillis());
		System.out.println( arl.toString());
		System.out.println("after time" + System.currentTimeMillis());
		arl.remove("abc7");
		System.out.println("after time" + System.currentTimeMillis());
		arl.get(4);
		System.out.println("after time" + System.currentTimeMillis());
		arl.size();
		System.out.println("after time" + System.currentTimeMillis());
		
	}

}
