package com.ibm.training.threads;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		byExtendingThreadClass();

	}

	private static void byExtendingThreadClass() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		
		System.out.println("About to start prime example in "+Thread.currentThread().getName());
		
		PrimeCounterThread t1 = new PrimeCounterThread(1, 150_000);
		PrimeCounterThread t2 = new PrimeCounterThread(150_001, 200_000);
		t1.start();
		t2.start();
		
//		while(t1.isAlive()) {
//			Thread.sleep(2000);
//		}
		
		t1.join();
		t2.join();
		
		System.out.println("There are "+(t1.getCount() + t2.getCount())+" primes between 1 and 200K");
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Took "+(stopTime - startTime)+" ms.");
	}

}
