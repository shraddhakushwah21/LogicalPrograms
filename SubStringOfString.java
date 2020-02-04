package com.java.logical;

public class SubStringOfString {

	public static void main(String[] args) {
		String str="java";
		String result=findSubString(str);
		System.out.println(result);

	}

	private static String findSubString(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				res += str.substring(i, j)+"\n";
			}
		}
		return res;
	}

}
