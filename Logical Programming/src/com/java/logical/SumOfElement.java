package com.java.logical;

public class SumOfElement {

	public static void main(String[] args) {
		//int[] arr= {1,6,4,3,2,2,3,8,1};
		int[] arr= {1,1,3,2,2,3};
		int len=arr.length;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < len; j++) {
	            if (arr[i] == arr[j]) {
	                while (j < (len) - 1) {
	                    arr[j] = arr[j+1];
	                    j++;
	                }
	                len--;
	            }
	        }
	    }
		System.out.println("After removing dulicates :");
		 for (int i = 0; i < len; i++) {
		        System.out.print("  " +arr[i]);
		    }
		 System.out.println();
		 for(int i=0;i<len;i++) {
			 sum += arr[i];
		 }
		System.out.println("Unique elements sum : "+sum);
	}

}
