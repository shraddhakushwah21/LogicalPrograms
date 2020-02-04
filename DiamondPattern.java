package com.java.logical;

public class DiamondPattern {

	public static void main(String[] args) {
		// Printing First half of the Diamond
		for(int i=1;i<=9;i++) {
			for(int j=i;j<9;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				//System.out.print("* ");
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		// Printing second half of the Diamond
		/*for(int i=1;i<=8;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=8;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		/*Output:
			 	* 
		       * * 
		      * * * 
		     * * * * 
		    * * * * * 
		   * * * * * * 
		  * * * * * * * 
		 * * * * * * * * 
		* * * * * * * * * 
		 * * * * * * * * 
		  * * * * * * * 
		   * * * * * * 
		    * * * * * 
		     * * * * 
		      * * * 
		       * * 
		        * 
		*/
		
		for(int i=8;i>=1;i--) {
			for(int j=8;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
