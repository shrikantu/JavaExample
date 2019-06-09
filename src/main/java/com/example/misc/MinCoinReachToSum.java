package com.example.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *  The HireVue consisted of two coding questions and two video interview questions. I was able to pick the language that I wanted.
 *  Question 1: Given coins of value 1, 3, and 6 and a sum, what is the minimum number of coins needed to reach the sum?
 *  
 */
public class MinCoinReachToSum {
	static HashMap<Integer, Integer> mapCount = null;

	public static void main(String[] args) {
		int[] a = { 6, 3, 1 };
		int totalCoinSize = a.length;
		Scanner scr = new Scanner(System.in);
		System.out.println(" Please enter Sum number ");
		String numStr = scr.nextLine();
		int number = Integer.parseInt(numStr);
		if (number <= 0) {
			System.out.println(" No minimum coin needed to reach sum");
		} else {
			mapCount = new HashMap<Integer, Integer>();
			minCoinToReachSum(a, totalCoinSize, number);
			System.out.println(mapCount);
		}


	}

	private static void minCoinToReachSum(int[] a, int totalCoinSize, int number) {
		for (int k = 0; k < totalCoinSize; k++) {
			System.out.println(number % a[k]);
			if (number >= a[k]) {
				if (number % a[k] >= 0) {
					int coinTotal = number/a[k];
					number = number % a[k];
					System.out.println(" number "+number);
					System.out.println(" coinTotal " + coinTotal);
					if (mapCount.containsKey(a[k])) {
						int totalCntFromMap = mapCount.get(a[k]);
						mapCount.put(a[k], totalCntFromMap + coinTotal);
					} else {
						mapCount.put(a[k], coinTotal);
					}
					minCoinToReachSum(a, totalCoinSize, number);
					break;
				}
			}
		}
	}

}
