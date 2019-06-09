package com.example.misc;

import java.util.Scanner;

public class PrintNumberToString {

	public static void main(String[] args) {
		String[] oneRange = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" ,"Ten"};
		String[] twentyRange = { "Elevan", "Twelve", "Threeteen", "Fourteen", "Fifteen", "SixTeen", "SevenTeen",
				"EighTeen", "NineTeen" };
		String[] hundredRange = { "", "Twenty", "Thrirty", "Fourty", "Fifty", "Sixty", "SevenTy", "EighTy",
				"Ninety" ,"Ten"};
		System.out.println("Please enter number ");
		Scanner scnr = new Scanner(System.in);
		String numberStr = scnr.nextLine();
		int number = Integer.parseInt(numberStr);
		int num = 0;
		if (number > 999 && number < 100000 ) {
			num = number / 1000;
			System.out.print(oneRange[num-1] + "Thousand");
			number = number % 1000;
		//	System.out.print(number);
		}
		if (number > 99 && number < 1000) {
			num = number / 100;
			System.out.print(oneRange[num-1] + "Hundred");
			number = number % 100;
			//System.out.print(number);
		}
		if (number > 20 && number < 100) {
			num = number / 10;
			System.out.print(hundredRange[num-1]);
			number = number % 10;
		//	System.out.print(number);
		}
		if (number < 20 && number >10) {
			System.out.print(twentyRange[number-10]);
			number = number % 10;
			//System.out.print(number);
		}
		if (number < 11 && number > 0) {
			System.out.print(oneRange[number-1]);
			//System.out.print(number);
		}
		System.out.print("Dollars");
	}
}
