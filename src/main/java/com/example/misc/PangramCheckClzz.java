package com.example.misc;

/**
 * 
 * Pangram Checking Given a string check if it is Pangram or not. A pangram is a
 * sentence containing every letter in the English Alphabet.
 * 
 * Examples : The quick brown fox jumps over the lazy dog ” is a Pangram
 * [Contains all the characters from ‘a’ to ‘z’] “The quick brown fox jumps over
 * the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to
 * ‘z’, as ‘l’, ‘z’, ‘y’ are missing]
 * 
 * 
 * @author Shrikant
 *
 */
public class PangramCheckClzz {

	public static void main(String[] args) {
		//String str = "The quick brown fox jumps over the lazy dog ";
		String str = "Shrikant";
		boolean status = isStringPangram(str);
		if (status) {
			System.out.println(str + "String is pangram");
		} else {
			System.out.println(str + "String is NOT pangram");
		}

	}

	private static boolean isStringPangram(String str) {
		boolean[] mark = new boolean[26];
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) < 'Z') {
				index = str.charAt(i) - 'A';
				System.out.println(index);
				mark[index] = true;
			}
			if ('a' <= str.charAt(i) && str.charAt(i) < 'z') {
				index = str.charAt(i) - 'a';
				System.out.println(index);
				mark[index] = true;
			}
		}
		for (int k = 0; k < 25; k++) {
			if (mark[k] == false) {
				return false;
			}
		}
		return true;
	}
}
