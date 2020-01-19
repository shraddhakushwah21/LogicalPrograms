// Find the third larget no. in the given array
package com.java.logical;

public class ThirdLargestElement {

	public static void main(String[] args) {
		int[] arr= {6,8,1,9,2,1,10};
		//int[] arr= {6,8,1,9,2,1,10,12};
		//int[] arr= {1};
		//int temp=0;
		if(arr.length < 3) {
			System.out.println("Invalid Input, Array size is less than 3 !");
		}else {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("Third Largest Number is : "+arr[arr.length-3]);
		}
		
	}

}
