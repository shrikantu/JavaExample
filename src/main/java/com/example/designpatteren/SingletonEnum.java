package com.example.designpatteren;

/**
 * 
 * @author Shrikant
 * 
 *         Method 1: Singleton With Public Static Final Field. 
 *         Method 2: Singleton With Public Static Factory Method.
 *         Method 3: Singleton With Lazy Initialization
 *         
 *         Problems With Serialization and Deserialization.
 *         Problems With Reflection
 *
 */

public enum SingletonEnum {
	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
