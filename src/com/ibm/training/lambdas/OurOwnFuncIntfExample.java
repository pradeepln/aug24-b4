package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class OurOwnFuncIntfExample {
	
//	public static <T> List<T> allMatches(List<T> src, MyCondition<T> condition){
//		List<T> result = new ArrayList<>();
//		for(T aValue : src) {
//			if(condition.test(aValue)) {
//				result.add(aValue);
//			}
//		}
//		return result;
//	}

	public static <T> List<T> allMatches(List<T> src, Predicate<T> condition){
		List<T> result = new ArrayList<>();
		for(T aValue : src) {
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
		
		List<Integer> iList = List.of(14,12,15,56,76);
		List<Integer> bigNumbers = allMatches(iList, i -> i > 12);
		System.out.println(bigNumbers);
		
	}

}


//class EPresenceCondition implements MyCondition{
//	@Override
//	public boolean test(String s) {
//		return s.contains("e");
//	}
//}