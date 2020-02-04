package com.java.logical;

public class PermutationOfString {

	public static void main(String[] args) {
		String s="abc";
		stringPermutation(s);

	}

	private static void stringPermutation(String s) {
		stringPermutation("",s);
		
	}

	private static void stringPermutation(String string, String s) {
		int count =0;
		if(s.length()==0) {
			System.out.println(string);
			
		}else {
			for(int i=0;i<s.length();i++) {
			    count++;
				stringPermutation(string+s.charAt(i),s.substring(0, i)+s.substring(i+1, s.length()));
			}
		}
		
		//System.out.println("count ::"+count);
		
	}

}
