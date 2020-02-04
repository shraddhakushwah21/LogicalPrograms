// To find Max difference between two elements in given array
package com.java.logical;

public class MaxDifference {

	public static void main(String[] args) {
		int[] arr= {2,5,1,7,3,9,5};
		//int[] arr= {9,2,12,5,4,7,3,19,5};
		int  maxDiff=0;
		/*
		 * for(int i=0;i<arr.length-1;i++) { for(int j=i+1;j<arr.length;j++) { int
		 * diff=Math.abs(arr[i]-arr[j]); if(maxDiff<diff) { maxDiff=diff; } } }
		 */
		// Using bubble sort
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("Maximum Difference between two elements of array is : "+(arr[arr.length-1]-arr[0]));
	}
}
