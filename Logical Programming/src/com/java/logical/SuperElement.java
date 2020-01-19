package com.java.logical;

import java.util.Scanner;

public class SuperElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of the array : " );
		int size=sc.nextInt();
	
		int[] arr=new int[size];
		System.out.print("Enter "+size+" elements in array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		superElement(arr);
		sc.close();
	}
	
	public static void superElement(int[] arr) {
		if(arr.length <=1) {
			System.out.println("No super elements!");
		}
		else {
			System.out.println("Super elements are : ");
			for(int i=0;i<arr.length;i++) {
				int count=0;
				for(int j=0;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						count++;
					}
				}
				if(count>=2) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
