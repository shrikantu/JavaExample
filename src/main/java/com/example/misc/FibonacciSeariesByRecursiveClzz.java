package com.example.misc;

public class FibonacciSeariesByRecursiveClzz {
	static int n1 = 0, n2 = 1, n3 = 0 ,total = 0;

	static void printFibonacci(int count) {
		while (0 < count) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			total =total+ n3;
			printFibonacci(count - 1);
			break;
		}
	}

	public static void main(String args[]) {
		int count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		total = n1 + n2;
		printFibonacci(count-2);// n-2 because 2 numbers are already printed
		System.out.println(" Total ="+total);
	}
}
