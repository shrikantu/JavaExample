package com.example.math;

import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
	    
	    
		Scanner s = new Scanner(System.in);
	    
	    // Get L and R from the input
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
    /*
        // Write here the logic to print all integers between L and R
        for(int j=L;j<=R;j++){
            System.out.print(j +" ");
        }
        
        System.out.print("\n");
    */    
               
        if(b < a) {
        System.out.println((a%c+b%c)%c);
        }
        else if (a < b) {
        	System.out.println(((a%c)-(b%c)+c)%c);
        }
        //System.out.println(((a%c)*(b%c))%c);
        //System.out.println(((a%c)*(Math.pow(b, -1)%c)+c)%c);

		s.close();
	}
}