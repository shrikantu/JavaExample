package com.example.inheritance;

public class MainInheritanceClassCRef {

	public static void main(String[] args) {
		
		
		System.out.println(" child-to-child referance");
		System.out.println(" **********************");
		Child c = new Child();
		System.out.println(c.i);
		c.meth1();     //child static
		c.meth2();     // child meth4
		c.meth3();    // parent meth3
		c.meth4();   // child meth4
		c.parentMeth1();   // parent static
	}

}
