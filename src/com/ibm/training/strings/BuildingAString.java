package com.ibm.training.strings;

public class BuildingAString {

	public static void main(String[] args) {
		String[] words = {"this","is","a","lengthy","sequence","of","strange","words","like","xerces","and","zulu"};
		
		String sentence = formSentence(words);
		
		
		System.out.println(sentence);
	}

	private static String formSentence(String[] words) {
//		String sentence = "";
//		for(int i = 0; i < words.length; i++) {
//			sentence = sentence + words[i] + " ";
//		}
//		return sentence;
		
		StringBuilder buffer = new StringBuilder();
		for(int i = 0; i < words.length; i++) {
			buffer.append(words[i]);
			buffer.append(" ");
		}
		
		return buffer.toString();
	}

}
