package com.ibm.training.threads;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		
		//byExtendingThreadClass();
		byImplementingRunnable();
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Took "+(stopTime - startTime)+" ms.");
	}

	private static void byImplementingRunnable() throws InterruptedException {
		
		PrimeCounterTask task1 = new PrimeCounterTask(1, 140_000);
		PrimeCounterTask task2 = new PrimeCounterTask(140_001, 200_000);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("There are "+(task1.getCount() + task2.getCount())+" primes b/w 1 and 200K");
	}

	private static void byExtendingThreadClass() throws InterruptedException {
		
		
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
		
		
	}

}
