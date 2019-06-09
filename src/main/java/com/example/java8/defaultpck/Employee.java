package com.example.java8.defaultpck;

public interface Employee {
	default void showName()
		{
		System.out.println("employee");
		}
}
