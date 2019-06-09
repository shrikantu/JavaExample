package com.example.thread;

/* IMPORTANT: Multiple classes and nested static classes are supported */
/*
 * Powers of primes
You are given a number n. Print the powers of all the prime factors of n in the prime factorization of n!.
Note:
Read more about prime factorization here: https://www.mathsisfun.com/prime-factorization.html
Output powers from the smallest prime factor of n to the largest prime factor.
Input format
One line input that consists of a number n.
Output format
Output powers of all prime factors of n in the prime factorization of n!.
Constraints
Sample Input
6
Sample Output
4 2
Explanation
Here, . So .
Prime factors of 2 and 3
Prime factorisation of  

Output powers of 2 and 3 from prime factorisation of  in correct order. So output is 4 and 2.

Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.
 */
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;

class TestClass3 {
	public static void main(String args[]) throws Exception {
		// Scanner
		//Scanner s = new Scanner(System.in);
		int num = 147;
				//s.nextInt(); // Reading input from STDIN
		List<Integer> lst = new ArrayList<Integer>();
		int factorial = 1;
		for (int j = 1; j <= num; j++) {
			factorial = factorial * j;
		}
		//System.out.print(factorial);
		for (int k = 2; k <= factorial; k++) {
			if (factorial % k == 0) {
				if (isPrime(k)) {
					if (!lst.contains(k)) {
						lst.add(k);
					}
				}
			}
			
		}
		Map<Integer,Integer> map =  new HashMap<Integer,Integer>();
		System.out.println(factorial(factorial, lst,map).entrySet());
	   
	}
	public static Map<Integer,Integer> factorial(int num , List<Integer> lst ,Map<Integer,Integer> map) {
		
		
		for (Integer i : lst) {
			if(num%i==0) {
				//System.out.println(i);
				
				if(map.containsKey(i)) {
					int count = map.get(i);
					count = count+1;
					map.remove(i);
					map.put(i, count);
				}else {
					map.put(i, 1);
				}
				return factorial(num/i, lst,map);
			}
		}
		return map;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
