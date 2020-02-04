package com.java.logical;

import java.util.Scanner;

public class ShiftZerosNOnes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of the array : " );
		int size=sc.nextInt();
	
		int[] arr=new int[size];
		System.out.print("Enter "+size+" elements in array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		shiftElements(arr);
		sc.close();
	}

	public static void shiftElements(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After Shorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
