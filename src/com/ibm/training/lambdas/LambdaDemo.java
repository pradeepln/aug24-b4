package com.ibm.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {

	static int si = 25;
	
	public static int wordsWithEFirst(String s1,String s2){
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

//arity           ret       argList
//s	acSp   mod    ret  name argList
	public static void main(String[] args) {
		String[] words = new String[]{"this","is","a","list","of","beautiful","words","like","zebra","and","gorilla"};

		System.out.println(Arrays.asList(words));
		
		//Arrays.sort(words, (String s1, String s2) -> {return s1.length() - s2.length();}); //step 1
		
		//Arrays.sort(words, (s1,s2) -> {return s1.length() - s2.length();}); //step 2
		
		//Arrays.sort(words, (s1,s2) -> s1.length() - s2.length()); //step 3
		
		//Arrays.sort(words, (s1,s2) -> s2.length() - s1.length());
		
		//Arrays.sort(words, (s1,s2) -> s1.charAt(0) - s2.charAt(0));
		
//		int count = 23;
//		
//		Arrays.sort(words, (s1,s2) -> {
//			System.out.println(count); //only final and effectively final local vars can be accessed in the lambda
//			
//			if(s1.contains("e") && !s2.contains("e")) {
//				return -1;
//			}else if(!s1.contains("e") && s2.contains("e")) {
//				return 1;
//			}else {
//				return 0;
//			}
//		});
		
		
		//Arrays.sort(words, (s1,s2) -> wordsWithEFirst(s1, s2));
		
		Arrays.sort(words, LambdaDemo::wordsWithEFirst);
		
		System.out.println(Arrays.asList(words));
		
		
	}

}
