package com.example.mainmethod;

public class MainMethodCls {
	public static void main(String[] args) {
		System.out.println("Execution starts from this method");
	}

	public void main(int args) {
		System.out.println("Another main method");
	}

	private double main(int i, double d) {
		System.out.println("Another main method");
		return d;
	}

	protected String main(String temp) {
		System.out.println("Another main method");
		return temp;
	}
}