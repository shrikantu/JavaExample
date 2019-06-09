package com.example.math;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
	public static void main(String args[]) throws Exception {
		/*
		 * Sample code to perform I/O: Use either of these methods for input
		 * 
		 * //BufferedReader BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String name = br.readLine(); // Reading input
		 * from STDIN System.out.println("Hi, " + name + "."); // Writing output to
		 * STDOUT
		 */
		Scanner s = null;
		try {
			// Scanner
			s = new Scanner(System.in);
			String name = s.nextLine(); // Reading input from STDIN
			// System.out.println("Hi, " + name + "."); // Writing output to STDOUT
			if (name != null && !name.isEmpty()) {
				String strArr[] = name.split(" ");
				int noCommonFactort = 0;
				int largestNumber = 0;
				for (int i = 0; i < strArr.length; i++) {
					int num = Integer.parseInt(strArr[i]);
					if (num == 0) {
						return;
					}
					if (largestNumber < num) {
						largestNumber = num;
					}
				}

				for (int j = 1; j < largestNumber; j++) {
					int trueCount = 0;
					for (int i = 0; i < strArr.length; i++) {
						int num = Integer.parseInt(strArr[i]);
						if (num == 0) {
							return;
						}
						if (num % j == 0) {
							++trueCount;
						}
					}
					if (trueCount == strArr.length) {
						++noCommonFactort;
					}
				}
				System.out.println(noCommonFactort);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}
}
