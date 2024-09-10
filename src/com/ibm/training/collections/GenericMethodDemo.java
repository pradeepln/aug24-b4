package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {

	
	
	public static <T> List<T> constructAList(T param1,T param2){
		List<T> result = new ArrayList<>();
		result.add(param1);
		result.add(param2);
		return result;
	}
	
	public static void main(String[] args) {
		
		List<String> sList = constructAList("hi", "hello");
		
		System.out.println(sList);
		
		List<Integer> iList = constructAList(14, 17);
		
		System.out.println(iList);
		
		//List<Integer> iList2 = constructAList("abc", 17);

	}

}
