package com.example.inheritance;

public class Parent {
	public int i = 20;
	
	static {
		System.out.println(" Parent static block ");
	}
	
	{
		System.out.println(" Parent instnace block ");
	}

	static public void meth1() {
		System.out.println(" Parent static meth1 ");
	}
	
	static public void parentMeth1() {
		System.out.println(" Parent static parentMeth1 ");
	}
	
	public void meth2() {
		System.out.println(" Parent meth2 ");
	}
	
	public void meth3() {
		System.out.println(" Parent meth3 ");
	}
}
