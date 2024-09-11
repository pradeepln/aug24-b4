package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UsingBuiltinFuncInterfaces {
	
//	public static List<String> transformedList(List<String> inputList,Function<String,String> transformationLogic){
//		List<String> outputList = new ArrayList<>();
//		
//		for(String aValue : inputList) {
//			String transformedValue = transformationLogic.apply(aValue);
//			outputList.add(transformedValue);
//		}
//		
//		return outputList;
//	}

	public static <T,R> List<R> transformedList(List<T> inputList,Function<T,R> transformationLogic){
		List<R> outputList = new ArrayList<>();
		
		for(T aValue : inputList) {
			R transformedValue = transformationLogic.apply(aValue);
			outputList.add(transformedValue);
		}
		
		return outputList;
	}
	
	public static void main(String[] args) {
		String[] wordsArr = new String[]{"this","is","a","list","of","beautiful","words","like","zebra","and","gorilla"};
		List<String> words = Arrays.asList(wordsArr);
		
		 List<String> excitingWords = transformedList(words, s -> s + "!");
		 System.out.println(excitingWords);
		 List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));
		 System.out.println(eyeWords);
		 List<Integer> iList = List.of(14,12,15,56,76);
		 List<Integer> squares = transformedList(iList, i -> i * i);
		 System.out.println(squares);
		 
		 List<Integer> wordLengths = transformedList(words, s -> s.length());
		 System.out.println(wordLengths);
	}

}
