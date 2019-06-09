/**
 * 
 */
package com.example.math;

/**
 * @author Shrikant
 *
 */
public class MainCalculate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length < 0 && args.length > 2) {
			System.out.println(" user input format is wrong");
		}
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(5 / 8);
		System.out.println(-3 * 5 / 8);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	}

}
