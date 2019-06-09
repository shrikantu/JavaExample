package com.example.staticexample;

public class MainClss {

	public static void printA() {
		System.out.println(" print from static printA method");
	}

	public void printB() {
		System.out.println(" print from instance printB method");
	}

	public static void main(String[] args) {
		MainClss clss = new MainClss();
		clss.printA();
		clss.printB();

		System.out.println("---------------------------------------------------------------------------");
		
		MainClss clzz = null;
		clzz.printA();
		clzz.printB();
	}
}
