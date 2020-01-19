package com.java.logical;

import java.util.Scanner;
/**
 * 
 * @author shraddha
 * @since 1/19/2020
 * Program to Reverse a String 
 */
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		String result=new ReverseString().reverseString(str);
		System.out.println("Reverse String  : "+result);

	}

	public String reverseString(String str) {
		String reverseStr="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseStr=reverseStr+str.charAt(i);
		}
		return reverseStr;
	}
}
