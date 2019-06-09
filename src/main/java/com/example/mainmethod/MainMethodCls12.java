package com.example.mainmethod;

public class MainMethodCls12  extends MainMethodCls11{

	public MainMethodCls12() {
		System.out.println(" Constructor  MainMethodCls12 ");
	}
	
	public void meth1() {
				System.out.println(" MainMethodCls12.meth1  ");
	}

	public static void main(String[] args) {
		MainMethodCls12 main12 = new MainMethodCls12();
		main12.meth1();
		System.out.println("  **** MainMethodCls12 ");
		
		MainMethodCls11 main11 =  new MainMethodCls12();
		main11.meth1();
		System.out.println("  **** MainMethodCls12.MainMethodCls11 ");
		
		MainMethodCls11 main10 =  new MainMethodCls11();
		main10.meth1();
		System.out.println("  **** MainMethodCls11. ");
	}
}