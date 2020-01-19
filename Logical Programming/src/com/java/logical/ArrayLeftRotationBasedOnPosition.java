package com.java.logical;

import java.util.Scanner;

public class ArrayLeftRotationBasedOnPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Size of the array : " );
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.print("Enter "+size+" elements in array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter position to rotate the array : ");
		int pos=sc.nextInt();
		leftRotate(arr, pos);
		sc.close();
	}
	
	public static void leftRotate(int[] arr,int pos) {
		for (int i = 0; i < pos; i++) {
			int j, temp=arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		System.out.println("After Rotation array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}

}
