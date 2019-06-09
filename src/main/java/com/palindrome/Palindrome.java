package com.palindrome;

import java.util.Scanner;

class Palindrome {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your nationality: ");
		
		int num = Integer.parseInt(scanner.nextLine());      //ABCBC
		int n = num; // used at last time check
		int reverse = 0, remainder;
		while (num > 0) {
			remainder = num % 10;                                                        //5%10   =4 
			System.out.println(" remainder "+remainder);
			reverse = reverse * 10 + remainder;
			System.out.println(" reverse "+reverse);
			num = num / 10;
			System.out.println(" num " +num);
		}

		if (reverse == n)
			System.out.println(n + " is a Palindrome Number");
		else
			System.out.println(n + " is not a Palindrome Number");
	}
}
