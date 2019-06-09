package com.example.thread;

public class PThreadMainCls {

	public static void main(String[] args) {
		Runnable r1 = new PThread1();
		Runnable r2 = new PThread2();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		/*try {
			//Thread.sleep(5000);
			//Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	
	}

}
