package com.java.logical;

import java.util.HashMap;

public class OccurencesOfCharacter {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = findOccurences("shraddhakushwahshraddha");
	
	    System.out.println(map);
	}
	
	public static HashMap<Character, Integer> findOccurences(String str){
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		int count =1;
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i))) {
				
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), count);
			}
		}
		
		return map;
		
		
		
	}
}
