package com.java.logical;

import java.util.HashMap;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		String str="This program is developed by Shraddha Kushwah";
		HashMap<String, Integer> words=countNumOfWords(str);
		System.out.println(words);
	}

	private static HashMap<String, Integer> countNumOfWords(String str) {
		String[] words=str.split(" ");
		HashMap<String, Integer> wordCount=new HashMap<>();
		for(int i=0;i<words.length;i++) {
			if(wordCount.containsKey(words[i])) {
				int count=wordCount.get(words[i]);
				wordCount.put(words[i], count);
			}else {
				wordCount.put(words[i], 1);
			}
		}
		return wordCount;
	}

}
