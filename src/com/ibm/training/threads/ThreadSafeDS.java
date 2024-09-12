package com.ibm.training.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadSafeDS {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		List<String> sl = Collections.synchronizedList(l);
		
		

	}

}
