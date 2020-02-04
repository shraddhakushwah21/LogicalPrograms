package com.java.logical;

public class FirstCharacterOfWordToCapitalLetter {

	public static void main(String[] args) {
		String str="i am a java developer";
		System.out.println("Original String :: "+str);
		String result=changeToCapitalLetter(str);
		System.out.println("Resultant String :: "+result);
	}

	private static String changeToCapitalLetter(String str) {
		String result="";
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length();j++) {
				char ch=s[i].charAt(0);
				//result += s[i].substring(0,1).toUpperCase()+s[i].substring(1, s[i].length());
				for(int k=97;k<=122;k++) {
					if(ch==k) {
						ch=(char) (ch-32);
					}
				}
				result += String.valueOf(ch)+s[i].substring(1,s[i].length());
				break;
			}
			result=result+" ";	
		}
		return result;
	}
	

}
