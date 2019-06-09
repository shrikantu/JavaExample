package com.example.inheritance;

public class Child extends Parent {
	public int i = 50;

	static {
		System.out.println(" Child static block ");
	}
	
	{
		System.out.println(" Child instnace block ");
	}
	
	static public void meth1() {
		System.out.println(" Child static meth1 ");
	}
	
	public void meth2() {
		System.out.println(" Child meth2 ");
	}

	public void meth4() {
		System.out.println(" Child meth4 ");
	}
}
