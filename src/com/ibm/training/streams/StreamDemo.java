package com.ibm.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		String[] words = new String[]{"this","is","a","list","of","beautiful","words","like","zebra","and","gorilla"};
		List<String> wordList = Arrays.asList(words);
		
//		Stream.of(words).forEach(s ->{ 
//			System.out.println("Processing an element");
//			System.out.println(s+"!");
//			});
		
//		wordList.stream().forEach(s -> System.out.print(s +" \t"));
		
//		wordList
//			.stream()
//			.map(s -> s.replace("i", "eye")) 
//			.map(s -> s.toUpperCase())
//			.forEach(s -> System.out.println(s+"!"));
		
//		List<String> result = wordList
//								.stream()
//								.map(s -> s.replace("i", "eye")) 
//								.map(s -> s.toUpperCase())
//								.toList();
//		System.out.println(result);
//		
//		List<Integer> nums = wordList
//								.stream()
//								.map(s -> s.length())
//								.map(i -> i * i)
//								.toList();
//		System.out.println(nums);
//		
//		wordList
//			.stream()
//			.filter(s -> s.length() > 2)
//			.map(s -> s.length())
//			.filter(n -> n%2 != 0)
//			.distinct()
//			.forEach(s -> System.out.print(s+"\t"));
		
		List<String> result =
		wordList
			.stream()
			.sorted((s1,s2) -> s1.length() - s2.length())
			.toList();
			//.forEach(s -> System.out.print(s+"\t"));
		System.out.println(result);
		
		String shortest = wordList.stream().min((s1,s2) -> s1.length() - s2.length()).get();
		System.out.println(shortest);
		
		String longest = wordList.stream().max((s1,s2) -> s1.length() - s2.length()).get();
		System.out.println(longest);
	}

}
