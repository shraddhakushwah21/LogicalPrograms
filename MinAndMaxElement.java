// To find  min and max elements in array
package com.java.logical;

import java.util.Scanner;

public class MinAndMaxElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter "+size+" elements in array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		minAndMaxElement(arr);
		sc.close();
	}
	
	// method for finding min and max elements 
	public static void minAndMaxElement(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Min elements in array is : "+arr[0]);
		System.out.println("Max elements in array is : "+arr[arr.length-1]);
	}

}
