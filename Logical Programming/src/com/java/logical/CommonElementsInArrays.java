package com.java.logical;

import java.util.Scanner;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// Entering size and elements in first array 
		System.out.print("Enter size of the  First array : ");
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		System.out.print("Enter "+size1+" elements in First array : ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		// Entering size and elements in Second array
		System.out.print("Enter size of the  Second array : ");
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		System.out.print("Enter "+size2+" elements in Second array : ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		// Entering size and elements in Third array
		System.out.print("Enter size of the  Third array : ");
		int size3=sc.nextInt();
		int[] arr3=new int[size3];
		System.out.print("Enter "+size3+" elements in Third array : ");
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=sc.nextInt();
		}
		commonElements(arr1, arr2, arr3);
		sc.close();
	}

	public static void commonElements(int[] arr1, int[] arr2, int[] arr3) {
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println("Common Elements in arrays are : "+arr1[i] +"  ");
				i++;
				j++;
				k++;
			}else if(arr1[i]<arr2[j]) {
				i++;
			}else if(arr2[j] < arr3[k]) {
				j++;
			}
			else {
				k++;
			}
			
		}
		System.out.println("No common elements found !");
	}
}
