package com.ibm.training.threads;

public class PrimeCounterTask implements Runnable{
	
	int begin,end;
	int count;
	
	public PrimeCounterTask(int begin,int end) {
		this.begin = begin;
		this.end = end;
	}

	@Override
	public void run() {
		System.out.println("Starting to count primes from "+begin+" to "+end+" in "+Thread.currentThread().getName());
		
		for(int i = begin; i <= end; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
	
		System.out.println("Finished counting in "+Thread.currentThread().getName());
	}
	
	
	public static boolean isPrime(long num) {
		if (num <= 2) {
			return true;
		}
		for (long i = 2; i < num; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int getCount() {
		return count;
	}
}
