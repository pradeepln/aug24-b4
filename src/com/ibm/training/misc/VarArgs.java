package com.ibm.training.misc;

public class VarArgs {
	
	public static int sumUp(int startAt,int... nums) {
		int sum = startAt;
		
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		return sum;
	}
	

	public static void main(String[] args) {
		int sum = sumUp(1000,17,12,32);
		System.out.println(sum);

	}

}
