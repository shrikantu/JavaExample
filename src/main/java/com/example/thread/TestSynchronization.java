package com.example.thread;

class Table1 {

	synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread11 extends Thread {
	public void run() {
		Table1 tbl = new Table1();
		tbl.printTable(1);
	}
}

class MyThread21 extends Thread {
	public void run() {
		Table1 tbl = new Table1();
		tbl.printTable(10);
	}
}

class MyThread31 extends Thread {
	public void run() {
		Table1 tbl = new Table1();
		tbl.printTable(100);
	}
}

class MyThread51 extends Thread {
	public void run() {
		Table1 tbl = new Table1();
		tbl.printTable(1000);
	}
}

public class TestSynchronization {
	public static void main(String t[]) {
		MyThread11 t1 = new MyThread11();
		MyThread21 t2 = new MyThread21();
		MyThread31 t3 = new MyThread31();
		MyThread51 t4 = new MyThread51();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
