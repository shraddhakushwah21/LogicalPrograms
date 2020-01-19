package com.java.logical;

import java.util.Scanner;

public class OccurranceOfCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String :: ");
		String str=sc.nextLine();
		occurranceOfChar(str);
	}
	
	public static void occurranceOfChar(String str) {
		//int count=0;
		char[] strArray=str.toCharArray();
		for(int i=0;i<strArray.length;i++) {
			 int count=1;
			 
			 //char temp = strArray[i];
			for(int j=i+1;j<strArray.length;j++) {
				if(strArray[i]==strArray[j]) {
					count++;
				}
			}
			
			  if(count>1) {
				  System.out.println(strArray[i]+" :: "+count);
			}
		}
	}
}
