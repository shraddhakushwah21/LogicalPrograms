package com.java.logical;

// Fibonacci series using recursion
public class FibonacciSeries {

	public static void main(String[] args) {
		int num=10;
		//int first=1,next=2;
		for(int i=1;i<=num;i++) {
			System.out.println(fibonacci02(i));
		}

	}
	
	public static int fibonacci01(int num) {
		if(num==1 || num==2) {
			return 1;
		}else {
			return fibonacci01(num-1)+fibonacci01(num-2);
		}
	}
	
	public static int fibonacci02(int num) {
		if(num==1 || num==2) {
			return 1;
		}else {
			int fib1=1,fib2=1,fib3=1;
			for(int i=3;i<=num;i++) {
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
			}
			return fib3;
		}
	}

}
