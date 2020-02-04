package com.java.logical;

public class RemovingSpacesFromString {

	public static void main(String[] args) {
		String str="Java is    a Programming        Language    ";
		
		// Removing spaces using predefined methods
		//String str2=str.replaceAll("\\s", "");
		String str2=str.replaceAll(" ", "");
		System.out.println(str2);
		
		
		// Removing spaces from string without using predefined methods
		char[] ch=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ' && ch[i]!='\t') {
				sb.append(ch[i]);
			}
		}
		System.out.println(" After removing white spaces string will be :: "+sb);
	}

}
