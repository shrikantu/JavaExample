package com.example.thread;

public class PThread2 implements Runnable {

	Printer p1 = new Printer();
	Printer p2 = new Printer();

	@Override
	public void run() {
		while (true) {
			synchronized (p2) {
				System.out.println("Resource P2 occupied");
				work();
				synchronized (p1) {
					System.out.println(" p2->p1-");
					work();
				}
			}
		}
	}
	
	private void work() {
        try {
        	System.out.println(" thread sleeping for 10000 milisecond");
            Thread.sleep(10000);
            System.out.println(" thread wakeup after 10000 milisecond");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
