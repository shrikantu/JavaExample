package com.example.misc;

import java.util.Scanner;

/**
 * 
 * He asked me to code a simple problem. Given
 * 
 * 1
 * 
 * 2 3
 * 
 * 4 5 6
 * 
 * 7 8 9 10, and so on. Now Given n, that is the last number(10 in this case),
 * we need to print the complete pattern
 * 
 * @author Shrikant
 *
 */
public class PrintPatteren {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println(" Please enter number ");
		String numStr = scnr.nextLine();
		int number = Integer.parseInt(numStr);
		printPatteren(number, 1, 1);
	}

	private static void printPatteren(int number, int startNumber, int count) {
		if (startNumber <= number) {
			for (int i = 1; i <= count; i++) {
				if (startNumber <= number) {
				System.out.print(" " + startNumber);
				startNumber++;
				}else {
					break;
				}
			}

			count++;
			System.out.println("\n");
			printPatteren(number, startNumber, count);
		}

	}

}
