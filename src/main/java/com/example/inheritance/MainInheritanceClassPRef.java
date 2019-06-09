package com.example.inheritance;

public class MainInheritanceClassPRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" parent-to-child referance");
		System.out.println(" **********************");
		Parent p = new Child();
		System.out.println(p.i);
		p.meth1();
		p.meth2();
		p.meth3();
		p.parentMeth1();
		//p.meth4();
		
		
	}

}
