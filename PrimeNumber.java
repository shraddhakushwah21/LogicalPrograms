package com.java.logical;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=23;
		boolean b=isPrimeNumber(num);
		if(b==true) {
		System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not prime number");
		}

	}

	private static boolean isPrimeNumber(int num) {
		int sqrt=(int) (Math.sqrt(num)+1);
		//for(int i=2;i<sqrt;i++) {
			//if(num%i==0) {
				//return false;
		//}
		//}
		if(num==2 || num==3) {
			return true;
		}
		if(num%2==0) {
			return false;
		}
		for(int i=3;i<sqrt;i += 2) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
