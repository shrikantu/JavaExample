package com.example.java8.optionalpkg;

public class ItemProcessMainClzz {

	public static void main(String[] args) {
		ItemProcessor ip = new ItemProcessor();
		Item item = ip.getItem();
		if (item != null) {
			System.out.println(item.getName());
	}else {
		System.out.println( " is null");
	}
	}

}
