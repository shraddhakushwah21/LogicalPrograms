package com.java.logical;

public class NoOfVowelsAndConsonantsInString {

	public static void main(String[] args) {
		String s="java is a programming language";
		noOfVowelsAndConsonant(s);

	}

	private static void noOfVowelsAndConsonant(String s) {
		int vowelCount=0,consonantCount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='E'||
					s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||
					s.charAt(i)=='u'||s.charAt(i)=='U') {
				vowelCount++;
			}else if(s.charAt(i)!=' ') {
				consonantCount++;
			}
		}
		System.out.println("No. of vowels in "+s+" are ::"+vowelCount);
		System.out.println("No. of consonant in "+s+" are ::"+consonantCount);
	}

}
