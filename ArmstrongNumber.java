package com.java.logical;

// To check No. is Armstrong or not
public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=171;
		boolean bool=isArmstrong(num);
		if(bool==true) {
			System.out.println(num+" is Armstrong");
		}else {
			System.out.println(num+" is not Armstrong");
		}
	}

	private static boolean isArmstrong(int num) {
		int sum=0 ,temp=num;
		while(num!=0) {
			int rem=num%10;
			sum += rem*rem*rem;
			num=num/10;
		}
		if(sum==temp) {
			return true;
		}
		return false;
	}

}
