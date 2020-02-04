package com.java.logical;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {10,20,45,30,56,78,90};
		reverseIntegerArray(arr);
		
		String[] str= {"Shraddha","Sonam","Ankit","Anshu","Ankur"};
		reverseStringArray(str);
	}

	private static void reverseIntegerArray(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("After Reverse Array is ::");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void reverseStringArray(String[] str) {
		System.out.println();
		for(int i=0;i<str.length/2;i++) {
			String temp=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=temp;
		}
		
		System.out.println("After Reverse Array is ::");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		
	}

	
}
