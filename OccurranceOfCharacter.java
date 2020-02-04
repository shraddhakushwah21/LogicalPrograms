package com.java.logical;

import java.io.CharConversionException;
import java.util.Scanner;

public class OccurranceOfCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String :: ");
		String str=sc.nextLine();
		occurranceOfChar(str);
		sc.close();
	}
	
	public static void occurranceOfChar(String str) {
		int count = 0;
		char[] charArray=str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			count=0;
			//charArray[i]=str.charAt(i);
			for(int j=0;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(str.charAt(i)+" :: "+count);
			}
		}
		if(str.length()<2 || count<2) {
			System.out.println("No duplicates found!");
		}
	}
}
