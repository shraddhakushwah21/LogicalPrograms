package com.java.logical;

import java.util.Arrays;

public class CheckEqualityOfArray {

	public static void main(String[] args) {
		int[] a={2, 5, 1, 7, 4};
		int[] b={2, 50, 1, 7, 4};
		isEqual(a,b);
		
		String[] s1= {"shraddha","sonam","ankit","anshu","ankur"};
		String[] s2= {"Ravi","sonam","ankit","anshu","ankur"};
		isEquals(s1,s2);
		
	}

	private static void isEquals(String[] s1, String[] s2) {
		if(Arrays.equals(s1, s2)){
			System.out.println("STRING ARRAYS ARE EQUALS");
		}else {
			System.out.println("STRING ARRAYS ARE NOT EQUALS");
		}
		
	}

	private static void isEqual(int[] a,int[] b) {
		boolean flag=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					 flag=false;
				}
			}
		}else {
			 flag=false;
		}
		if(flag) {
			System.out.println("INTEGER ARRAYS ARE EQUALS");
		}else {
			System.out.println("ARRAYS ARE NOT EQUALS");
		}
		
	}
	
	

}
