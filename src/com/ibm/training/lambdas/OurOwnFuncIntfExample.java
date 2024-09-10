package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class OurOwnFuncIntfExample {
	
	public static List<String> allMatches(List<String> src, MyCondition condition){
		List<String> result = new ArrayList<>();
		for(String aValue : src) {
			if(condition.test(aValue)) {
				result.add(aValue);
			}
		}
		return result;
	}

	
	public static void main(String[] args) {
		String[] words = new String[]{"this","is","a","list","of","beautiful","words","like","zebra","and","gorilla"};
		
		List<String> wordList = new LinkedList<>(Arrays.asList(words));
		
		List<String> wordsLongerThan3 = allMatches(wordList, s -> s.length() > 3);
		System.out.println(wordsLongerThan3);
		List<String> wordsHavingLetterE = allMatches(wordList, s -> s.contains("e"));
		System.out.println(wordsHavingLetterE);
		
	}

}


//class EPresenceCondition implements MyCondition{
//	@Override
//	public boolean test(String s) {
//		return s.contains("e");
//	}
//}