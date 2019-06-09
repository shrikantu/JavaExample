package com.example.thread;

class Table {

	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread1 extends Thread {
	public void run() {
		System.out.println("------------------------ thread 1 --------------------");
		Table.printTable(1);
	}
}

class MyThread2 extends Thread {
	public void run() {
		System.out.println("------------------------ thread 2 --------------------");
		Table.printTable(10);
	}
}

class MyThread3 extends Thread {
	public void run() {
		System.out.println("------------------------ thread 3 --------------------");
		Table.printTable(100);
	}
}

class MyThread4 extends Thread {
	public void run() {
		System.out.println("------------------------ thread 4 --------------------");
		Table.printTable(1000);
	}
}

public class StaticTestSynchronization {
	public static void main(String t[]) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();
		t1.start();
		t1.setName("Thread -1");
		t2.start();
		t1.setName("Thread -2");
		t3.start();
		t1.setName("Thread -3");
		t4.start();
		t1.setName("Thread -4");
	}
}