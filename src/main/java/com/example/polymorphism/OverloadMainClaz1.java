package com.example.polymorphism;

class X {
	void calculate(int a, int b) {
		System.out.println("Class X");
	}
}

class Y extends X {
	@Override
	void calculate(int a, int b) {
		System.out.println("Class Y");
	}
}

class Z extends Y {
	@Override
	void calculate(int a, int b) {
		System.out.println("Class Z");
	}
}

public class OverloadMainClaz1 {
	public static void main(String[] args) {
		System.out.println("------------------------1------------------------------");
		X x = new Y();
		x.calculate(10, 20);

		System.out.println("------------------------2------------------------------");
		Y y = (Y) x;
		y.calculate(50, 100);

		System.out.println("------------------------4------------------------------");
		Z z1 = (Z) x;
		z1.calculate(100, 200);
		
		
		System.out.println("------------------------3------------------------------");
		Z z = (Z) y;
		z.calculate(100, 200);
		
		
	}
}