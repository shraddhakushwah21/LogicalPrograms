package com.java.logical;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int num1=10,num2=20;
		swapNumbers(num1,num2);

	}

	private static void swapNumbers(int num1, int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(" Number 1 :: "+num1);
		System.out.println(" Number 2 :: "+num2);
	}

}
