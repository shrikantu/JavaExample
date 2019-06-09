/**
 * 
 */
package com.example.misc;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Shrikant
 *
 */
public class DuplicateFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]  duplicateArray = {1,2,3,4,5,1,2,3,3,8,4};
		Set<Integer> hset = new HashSet<Integer>();
		for(int i=0;i<duplicateArray.length;i++) {
			hset.add(duplicateArray[i]);
		}
		Iterator<Integer> it = hset.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next());
	     }

	     Set hset1 = new HashSet(Arrays.asList(duplicateArray));
	     System.out.println(hset);
	}
	

}
