package com.java.logical;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int num=12345;
		int result=getReverseNumber02(num);
		System.out.println("Reverse Number :: "+result);
	}

	private static int getReverseNumber(int num) {
		String str=String.valueOf(num);
		int reverse=0;
		String revStr="";
		for(int i=str.length()-1;i>-1;i--) {
			revStr += str.charAt(i);
		}
		reverse=Integer.parseInt(revStr);
		return reverse;
	}
	public static int getReverseNumber02(int num) {
		int rem=0,reverse=0;
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num = num/10;
		}//while(num!=0);
		return reverse;
	}

}
