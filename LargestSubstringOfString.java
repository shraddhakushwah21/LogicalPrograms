package com.java.logical;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstringOfString {

	public static void main(String[] args) {
		String str="java";
		findLargestSubstring(str);			
	}

	private static void findLargestSubstring(String str) {
		String res="";
		int len=0;
		char[] arr=str.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<arr.length;i++) {
			char ch= arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>len) {
				len=map.size();
				res=map.keySet().toString();
			}
		}
		System.out.println("Longest substring :: "+res+" ---> "+len);
		
	}

}
