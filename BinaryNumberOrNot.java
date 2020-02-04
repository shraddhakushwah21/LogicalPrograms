package com.java.logical;

public class BinaryNumberOrNot {

	public static void main(String[] args) {
		Integer num=121212;
		boolean b=true;
		Integer temp=num;
		while(num!=0) {
			int rem=num%10;
			if(rem>1) {
				b=false;
				break;
			}else {
				num /= 10;
			}
		}
		if(b) {
			System.out.println("NUMBER IS BINARY NUMBER");
		}else {
			System.out.println("NUMBER IS NOT BINARY NUMBER");
		}

	}

}
