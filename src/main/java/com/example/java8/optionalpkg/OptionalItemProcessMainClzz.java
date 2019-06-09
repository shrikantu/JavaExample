package com.example.java8.optionalpkg;

import java.util.Optional;

/**
 * Java 8 introduced a new container class java.util.Optional<T>. It wraps a
 * single value, if that value is available. If the value is not available an
 * empty optional should be returned. Thus it represents null value with absent
 * value. This class has various utility methods like isPresent() which helps
 * users to avoid making use of null value checks. So instead of returning the
 * value directly, a wrapper object is returned thus users can avoid the null
 * pointer exception.
 * 
 * 
 * @author Shrikant
 *
 */
public class OptionalItemProcessMainClzz {

	public static void main(String[] args) {
		OptionalItemProcessor ip1 = new OptionalItemProcessor();
		Optional<Item> item = ip1.getItem();
		if (!item.isPresent()) {
			System.out.println("not present");
		} else {
			System.out.println(item.get().getName());
		}

		Optional<Item> itemEmpty = ip1.getItemEmpty();
		if (!itemEmpty.isPresent()) {
			System.out.println("not present");
		} else {
			System.out.println(item.get().getName());
		}
	}
}
