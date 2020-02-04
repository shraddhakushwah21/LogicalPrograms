package com.java.logical;

public class ExceptionTrial {

	public static void main(String[] args) {
		try {
			args=null;
			args[0]="test";
			System.out.println(args[0]);
		} catch (Exception e) {
			System.out.println("Exception");
		} /*
			 * catch (NullPointerException ex) { System.out.println("NullPointerException");
			 * }
			 */

	}

}
