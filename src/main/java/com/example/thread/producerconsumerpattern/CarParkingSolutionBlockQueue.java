package com.example.thread.producerconsumerpattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CarParkingSolutionBlockQueue {

	public static void main(String[] args) throws NumberFormatException, InterruptedException {
		BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<Integer>();
		BlockingQueue<Integer> parkingCapacity = new LinkedBlockingQueue<Integer>();
		parkingCapacity.put(new Integer("5"));

		AllocateParking p = new AllocateParking(sharedQ, parkingCapacity);
		ReleaseParking c = new ReleaseParking(sharedQ, parkingCapacity);
		
		p.start();
		c.start();
	}
}

class AllocateParking extends Thread {
	private BlockingQueue<Integer> sharedQueue;
	private BlockingQueue<Integer> parkingCapacity;

	public AllocateParking(BlockingQueue<Integer> aQueue, BlockingQueue<Integer> parkingCapacity) {
		super("AllocateParking");
		this.sharedQueue = aQueue;
		this.parkingCapacity = parkingCapacity;
	}

	public void run() {
		// no synchronization needed
		int i = 0;
		while (!parkingCapacity.isEmpty()) {
			i++;
			try {
				System.out.println(getName() + " Allocate Parking " + i);
				parkingCapacity.take();
				sharedQueue.put(i);
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class ReleaseParking extends Thread {
	private BlockingQueue<Integer> sharedQueue;
	private BlockingQueue<Integer> parkingCapacity;

	public ReleaseParking(BlockingQueue<Integer> aQueue, BlockingQueue<Integer> parkingCapacity) {
		super("ReleaseParking");
		this.sharedQueue = aQueue;
		this.parkingCapacity = parkingCapacity;
	}

	public void run() {
		try {
			while (true) {
				Integer item = sharedQueue.take();
				parkingCapacity.put(item);
				System.out.println(getName() + " Release Parking " + item);
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
