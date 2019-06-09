package com.example.java8.defaultpck;

class Person implements Employee, Parent {
	public static void main(String args[]) {
		new Person().showName();
	}

	@Override
	public  void showName() {
		System.out.println("parent");

	}
}
