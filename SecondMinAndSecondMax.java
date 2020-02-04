// To find Second min and max elements in array
package com.java.logical;

import java.util.Scanner;

public class SecondMinAndSecondMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter "+size+" elements in array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		secondMinAndMax(arr);
		int secondLargest=secondLargest(arr);
		System.out.println(secondLargest);
		sc.close();
	}
	
	// method for finding second min and second max elements 
		public static void secondMinAndMax(int[] arr) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("Min elements in array is : "+arr[1]);
			System.out.println("Max elements in array is : "+arr[arr.length-2]);
		}


		public static int secondLargest(int[] arr) {
			int largest=0,secondLargest=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>largest) {
					secondLargest=largest;
					largest=arr[i];
				}else if(arr[i]>secondLargest) {
					secondLargest=arr[i];
				}
			}
			return secondLargest;
		}
}
