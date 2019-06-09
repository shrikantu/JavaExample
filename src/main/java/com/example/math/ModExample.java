package com.example.math;

import java.util.Scanner;

/*public class ModExample {
 public static void main(String args[]) {
	 Scanner scanner = new Scanner(System.in);
	 scanner.
	 int k=30;
	 int sum =0;
	 for(int i=1;i<k;i++) {
		 if(k%i ==0) {
			 sum = sum +i;
		 System.out.println(i);
		 }
	 }
	 System.out.println(sum);
 }
}
*/
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

class ModExample {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 */
        //Scanner
        Scanner s = new Scanner(System.in);
        
        //String name = s.nextLine();                 // Reading input from STDIN
       // System.out.println(name);    // Writing output to STDOUT

       // Write your code here
      //System.out.println(s.nextLine());
      
      while(s.hasNextLine()){
          int num = Integer.parseInt(s.nextLine());
          int sum=0;
          if(num <9) {
        	 System.out.println(num);
          }else {
        	  
        	  if(num/9 >0) {
        		  int result = num%9+10*divide(num/9);  
        	  }
        	  
          }
          
         // System.out.println(sum);
      }
    }
    
    public static int divide(int num) {
    	if(num < 9) {
    		return num;
    	}else {
    		return num%9+10*divide(num/9);
    	}
    }
}
