package com.java.logical;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int num =6;
		int result=findFact(num);
		System.out.println("Factorial of "+num+" is "+result);

	}

	private static int findFact(int num) {
		int fact=1;
		if(num==0) {
			return 0;
		}
		for(int i=1;i<=num;i++) {
			fact *= i;
		}
		return fact;
	}

}
