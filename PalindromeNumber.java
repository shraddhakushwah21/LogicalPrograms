package com.java.logical;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=17771;
		boolean bool=isPalindrome(num);
		if(bool==true) {
			System.out.println(num+" is Palindrome");
		}else {
			System.out.println(num+" is not Paindrome");
		}
	}

	private static boolean isPalindrome(int num) {
		int revNum=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			revNum=revNum*10+rem;
			num=num/10;
		}
		if(temp==revNum) {
			return true;
		}
		return false;
	}

}
