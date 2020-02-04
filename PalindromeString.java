package com.java.logical;

public class PalindromeString {

	public static void main(String[] args) {
		String str="SOS";
		boolean b=isPalindrome(str);
		if(b==true) {
			System.out.println(str+" is Palindrome");
		}else {
			System.out.println(str+" is not Paindrome");
		}
	}

	private static boolean isPalindrome(String str) {
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr += str.charAt(i);
		}
		if(str.equalsIgnoreCase(revStr)) {
			return true;
		}
		return false;
	}

}
