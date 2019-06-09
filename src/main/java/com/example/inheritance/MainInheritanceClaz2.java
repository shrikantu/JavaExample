package com.example.inheritance;

class X {
	int i = 101010;

	public X() {
		i = i++ + i-- - i;
		 //101011
		//(101009 + 101010)  = 
	}

	static int staticMethod(int i) {
		return --i;
	}
}

class Y extends X {
	public Y() {
		System.out.println(staticMethod(i));
	}
}

public class MainInheritanceClaz2 {
	public static void main(String[] args) {
		Y y = new Y();
	}
}