package com.example.misc;

import java.util.Scanner;

/**
 * Question 2: Given an integer, add it with the reverse of the value, and check
 * if it’s a palindrome. If it isn’t a palindrome, repeat the process until the
 * sum is a palindrome. Print out the number of iterations and the value of the
 * final palindrome.
 * 
 * @author Shrikant
 *
 */
public class PalindromWithNumberCalculation {
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		System.out.println(" Please enter number ");
		String numStr = scnr.nextLine();
		try {
			int number = Integer.parseInt(numStr);
			validatePalindromNumber(number);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void validatePalindromNumber(int number) {
		StringBuilder sb = new StringBuilder(String.valueOf(number));
		//System.out.println(sb.reverse());
		//System.out.println(" reverse number " + sb.toString());
		int totalAmt = number +Integer.parseInt(sb.toString());
		//System.out.println(" totalAmt =  " +totalAmt);
		StringBuilder sb1 = new StringBuilder(String.valueOf(totalAmt));
		sb1.reverse();
		if(String.valueOf(totalAmt).equals(sb1.toString())) {
			System.out.println( " sum of number and its reverse is Palindrom " + number +  "+" +sb.toString() + "=" +totalAmt + " ==>"+sb1.toString());
			validatePalindromNumber(totalAmt);
		}else {
			System.out.println( " sum of number and its reverse is NOT Palindrom " + number +  "+" +sb.toString() + "=" +totalAmt + " ==>"+sb1.toString());
		}
		
	}
}
