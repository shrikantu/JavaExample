package com.example.polymorphism;

class A {

}

class B extends A {

}

class C extends B {

}

public class OverloadMainClaz {
	static void overloadedMethod(A a) {
		System.out.println("ONE");
	}

	static void overloadedMethod(B b) {
		System.out.println("TWO");
	}

	static void overloadedMethod(Object obj) {
		System.out.println("THREE");
	}

	public static void main(String[] args) {
		C c = new C();
		overloadedMethod(c);
		
		B b = new C();
		overloadedMethod(b);
		
		B b1 = new B();
		overloadedMethod(b1);
		
		A a = new B();
		overloadedMethod(a);
		
		A a1 = new C();
		overloadedMethod(a1);
		
		A a2 = new A();
		overloadedMethod(a2);
	}
}