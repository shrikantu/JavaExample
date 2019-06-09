package com.example.misc;

import java.math.BigInteger;

public class FibonacciSeriesClass {

	public static void main(String[] args) {
		// System.out.println(fib(9));
		System.out.println("  fibbonaci = " + fibbonaci(10));
		//System.out.println("  fibbonaci = " + fibbonaci(new BigInteger("100")));
	}

	static long fibbonaci(long n) {
		long prev = 0, next = 1, result = 0 , total = 0;
		System.out.print(prev + " "+next);
		for (long i = 1; i < n-1; i++) {
			
			result = prev + next;
			prev = next;
			next = result;
			System.out.print(" " + result);
			total+=result;
		}
		System.out.println(" total = "+ total);
		return result;
	}

	static BigInteger fibbonaci(BigInteger n) {
		BigInteger prev = BigInteger.ZERO, next = BigInteger.ONE, result = BigInteger.ZERO;

		for (BigInteger bi = BigInteger.ZERO; bi.compareTo(n) < 0; bi = bi.add(BigInteger.ONE)) {
			System.out.print(" "+result);
			result = prev.add(next);
			prev = next;
			next = result;
		}
		
		return result;
	}
}
