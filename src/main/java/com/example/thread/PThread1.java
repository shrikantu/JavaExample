package com.example.thread;

public class PThread1 implements Runnable {

	Printer p1 = new Printer();
	Printer p2 = new Printer();

	@Override
	public void run() {
		while (true) {
			synchronized (p1) {
				System.out.println("Resource P1 occupied");
				work();
				synchronized (p2) {
					System.out.println(" p1->p2-");
					work();
				}
			}
		}
	}
	
	private void work() {
        try {
        	System.out.println(" thread sleeping for 5000 milisecond");
            Thread.sleep(5000);
            System.out.println(" thread wakeup after 5000 milisecond");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
