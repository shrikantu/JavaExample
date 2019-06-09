package com.example.math;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class JavaSqrtExample {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(12345));
		Random random = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.println(" using math.random =>" +(int)Math.random()*5+1);
			System.out.println(" using random.nextint =>"+random.nextInt(i));
			System.out.println(" ThreadLocalRandom.current().nextInt =>"+ThreadLocalRandom.current().nextInt(i));
		}
	}

}
