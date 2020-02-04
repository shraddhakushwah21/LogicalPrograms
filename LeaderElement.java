package com.java.logical;

import java.util.Scanner;

public class LeaderElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of the array : " );
		int size=sc.nextInt();
	
		int[] arr=new int[size];
		System.out.print("Enter "+size+" elements in array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		leaderElement(arr);
		sc.close();
	}
	
	public static void leaderElement(int[] arr) {
		int element=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]==arr[i]) {
					count++;
					if(count > (arr.length/2)) {
						element=arr[i];
				}
			}
		}
		}
		if(element!=0) {
			System.out.println("Leader element is : "+element);	
		}else {
			System.out.println("Leader element doesn't exist");
		}
	}
}
