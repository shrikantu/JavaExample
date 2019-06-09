package com.example.abstraction;

abstract class Calculate {
	abstract int add(int a, int b);
}

public class AbstractMainClazz {

	public static void main(String[] args) {
		int result = new Calculate() {
			@Override
			int add(int a, int b) {
				System.out.println(" a="+1 +" b =" +b);
				return a + b;
			}
		}.add(11010, 022011);
		System.out.println(result);
	}
}