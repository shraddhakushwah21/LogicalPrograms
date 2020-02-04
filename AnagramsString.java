package com.java.logical;

public class AnagramsString {

	public static void main(String[] args) {
		String s1="green";
		String s2="grown";
		boolean b=isAnagram(s1,s2);
		if(b==true) {
			System.out.println(s1+" and "+s2+" is anagram strings");
		}else {
			System.out.println("Not anagram strings");
		}
	}

	private static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j] && i!=j) {
					return true;
				}
			}
		}
		return false;
	}

}
