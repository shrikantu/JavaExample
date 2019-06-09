package com.example.misc;

public class ReplaceCertainCharFromString {

	public static void main(String[] args) {
		replaceCharFromStringUsingCharAt();
		replaceCharFromStringUsingreplace();
	}

	public static void replaceCharFromStringUsingCharAt() {
		String str = "Shrikant";
		char[] abc;
		abc = new char[20];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				abc[i] = 'X';
			} else {
				abc[i] = str.charAt(i);
			}
		}
		System.out.println(new String(abc));
	}
	
	public static void replaceCharFromStringUsingreplace() {
		String str = "Shrikant";
		String s = str.replace("t","Y");
		System.out.println(" String " +s);
	}
}
