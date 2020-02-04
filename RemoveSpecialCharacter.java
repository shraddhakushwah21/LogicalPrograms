package com.java.logical;

import java.util.Scanner;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String :: ");
		String str=sc.nextLine();
		String result=removeSpecialSymbol(str);
		System.out.println("After removing Special charcaters :: "+result);
	}
	
	public static boolean isNumeric(char c) {
		
		
		try{
			Integer.parseInt(String.valueOf(c));
			return true;
		}catch(NumberFormatException e) {
			System.out.println(e.getLocalizedMessage());
			return false;
		}
		
	}
	
	
	
	public static String removeSpecialSymbol(String str) {
		String result="";
//		for(int i=0;i<str.length();i++) {
//			for(int j=65;j<=118;j++) {
//				if(str.charAt(i)==j || isNumeric(str.charAt(i))) {
//					
//					
//					if(isNumeric(str.charAt(i))) {
//						result=result+str.charAt(i);
//						break;
//					}else {
//						result=result+str.charAt(i);
//					}
//				}
//			}
//		}
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
				result=result+str.charAt(i);
			}
		}
		
		return result;
	}

}
