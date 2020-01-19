package com.java.logical;

import java.util.Scanner;

public class FirstNonRepeatingCharcterOfString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String :: ");
		String str=sc.nextLine();
		char result=findNonRepeatingChar(str);
		System.out.println("First Non-Repeating charcater of String is :: "+result);
	}

	public static Character findNonRepeatingChar(String str) {
		char ch=0;
		//int count =0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)!=str.charAt(j)) {
					ch=str.charAt(i);
					break;	
				}
			}
	}
		return ch;
	}
	
}

