package com.example.misc;

import java.util.Scanner;

public class AddOneToNumber {

	static int addOne(int x) {
		int y = (~x);
		System.out.println(" y = "+y);
		return (-y);
	}


	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);
		System.out.println(" Please enter number :");
		String numStr = scrn.nextLine();
		int number = Integer.parseInt(numStr);
		System.out.printf("%d", addOne(number));
	}

}
