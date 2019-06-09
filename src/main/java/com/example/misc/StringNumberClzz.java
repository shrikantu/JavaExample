package com.example.misc;

import java.util.Scanner;

/**
 * 
 * @author Shrikant
 *
 *         String of numbers was given as input and i have to insert * between
 *         to even integers and - between to odd integers and print the final
 *         string
 *
 */

public class StringNumberClzz {
	public static void main(String args []) {
		Scanner scnr = new Scanner(System.in);
		System.out.println(" Please enter number :");
		String numStr = scnr.nextLine();
		
		char[] numbers = numStr.toCharArray();
		String result = "";

		for(int i = 1; i < numbers.length; i++)
		{
		    int value1 = Character.getNumericValue(numbers[i-1]);  //9  //9 //3 //3
		    int value2 = Character.getNumericValue(numbers[i]);     //9  //3  //3 //4
		    result += value1;
		    if(value1 % 2 == 0 && value2 % 2 == 0) {
		        result += "*";
		    }else {
		        result += "-";
		    }
		}
		result += numbers[numbers.length - 1];
		System.out.println(result);
	}
}
