package com.java.logical;

public class PyramidOfNumber {

	public static void main(String[] args) {
		/*
		// Pyramid Based on same number in a row
		/*
		 1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
 */
		/*
		System.out.println("Same row value Pyramid ");
		System.out.println("-------------------------------------------");
		for(int i=1;i<=9;i++) {
			for(int j=9-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		*/
		/*
		// Pyramid Based on different number in a row
		System.out.println("Same asending row value Pyramid ");
		 /*
		 1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
 */
	/*	System.out.println("-------------------------------------------");
		for(int i=1;i<=9;i++) {
			for(int j=9-i;j<=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		*/
		
		/*
		System.out.println("\n");
		// Pyramid Based on different number in a row
		System.out.println("Same asending and descending row value triangle ");
		System.out.println("----------------------------------------------------");
		/*
		  	 1
	        121
	       12321
	      1234321
	     123454321
	    12345654321
	   1234567654321
	  123456787654321
	 12345678987654321
	 */
		/*
		for(int i=1;i<=9;i++) {
			for(int j=i;j<=9;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(int x=i-1;x>=1;x--) {
				System.out.print(x);
			}
			System.out.println();
		}
		*/
		
		/*
		1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
		  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
		    1 2 3 4 5 6 7 6 5 4 3 2 1
		      1 2 3 4 5 6 5 4 3 2 1
		        1 2 3 4 5 4 3 2 1
		          1 2 3 4 3 2 1
		            1 2 3 2 1
		              1 2 1
		                1
		  */
		/*
		for(int i=9;i>=1;i--) {
			for(int j=i;j<=9;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(int x=i-1;x>=1;x--) {
				System.out.print(x);
			}
			System.out.println();
		}
		*/
		/*
					                9	
					              8 9 8
					            7 8 9 8 7
					          6 7 8 9 8 7 6
					        5 6 7 8 9 8 7 6 5
					      4 5 6 7 8 9 8 7 6 5 4
					    3 4 5 6 7 8 9 8 7 6 5 4 3
					  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
					1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
		*/
		
		for(int i=9;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=9;k++) {
				System.out.print(k);
			}
			for(int x=8;x>=i;x--) {
				System.out.print(x);
			}
			System.out.println();
		}
		
	}
}
