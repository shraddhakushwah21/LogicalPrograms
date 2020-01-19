// WAP to remove duplicate elements from the given array 
package com.java.logical;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr= {1,2,5,5,6,6,7,2};
		int len=arr.length;
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
	    for (int i = 0; i < len; i++) {
	        System.out.print("  " +arr[i]);
	    }

		}
	}
