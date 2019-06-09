package com.example.misc;

public class PalindromeClass {

	public static void main(String[] args) {
		String str = "abcbad";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("sb rever " + sb.toString());
		String reversestr = sb.toString();
		if (str.equals(reversestr)) {
			System.out.println(" String is Palindrome");
		} else
			System.out.println(" String is not Palindrome");
	}

}
