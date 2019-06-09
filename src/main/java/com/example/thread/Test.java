package com.example.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class A extends Thread {
	int count = 0;

	public void run() {
		System.out.println("run");
		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				count = count + i;
				System.out.println(" block 2 " +count);
			}
			notify();
		}
	}
}

public class Test {

	public static void main(String argv[]) {
		A a = new A();
		a.start();
		synchronized (a) {
			System.out.println("waiting");
			try {
				a.wait();
				System.out.println(" block 1 " +a.count);
			} catch (InterruptedException e) {

			}
			System.out.println(" block 3 " +a.count);

		}
	}
}
