package com.example.misc;

import java.util.Scanner;

//simple exercises about how to add a binary number to another, and I cannot remember the second one. 

public class AddBinaryNumberToOther {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println(" Enter first Binary Number");
		String firstNumber = scr.nextLine();
		
		System.out.println(" Enter second Binary Number");
		String secondNumber = scr.nextLine();
		
		String totalBinary = add (firstNumber,secondNumber);
		System.out.println(" totalBinary =>" +totalBinary);
	}
//11010
	private static String add(String firstNumber, String secondNumber) {
		int firstBinary = Integer.parseInt(firstNumber, 2);
		System.out.println("  firstBinary " + firstBinary);
		int secondBinary = Integer.parseInt(secondNumber, 2);
		System.out.println("  secondBinary " + secondBinary);
		int total = firstBinary + secondBinary;
		System.out.println("  total " + total);
		Integer addTotal = new Integer(total);
		return addTotal.toBinaryString(total);
	}

}
