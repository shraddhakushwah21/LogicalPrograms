package com.java.logical;

import java.util.Scanner;

public class PairSumEqualToNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter "+size+" elements in array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Sum to Check : ");
		int sum=sc.nextInt();
		new PairSumEqualToNumber().checkPairSum(arr, sum);
		sc.close();
	}

	
	public void checkPairSum(int[] arr, int sum) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(" Pairs with sum "+sum+" are ("+arr[i]+" , "+arr[j]+" )");
				}
			}
		}
	}
}
