package com.ibm.training.lambdas;

@FunctionalInterface
public interface MyCondition<T> {
	
	public boolean test(T s);
	
}
