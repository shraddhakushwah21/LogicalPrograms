package com.java.logical;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author shraddha
 * @since 1/19/2020
 * Program to Reverse each word of String 
 */

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		String result=new ReverseEachWordOfString().reverseWordOfString(str);
		System.out.println("Reverse String : "+result);
		sc.close();
	}
	
	public String reverseWordOfString(String str) {
		String reverseStr="";
		String[] strArray=str.split(" ");
		for(int i=0;i<strArray.length;i++) {
			for(int j=strArray[i].length()-1;j>=0;j--) {
				reverseStr=reverseStr+strArray[i].charAt(j);
			}
			reverseStr =reverseStr+" ";
		
		}
		return reverseStr;
	}

}
