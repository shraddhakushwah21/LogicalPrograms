package com.java.logical;

public class EnterNumberIsDigitOrNot {

	public static void main(String[] args) {
		String s="123456987";
		isNumberOrNot(s);

	}

	private static void isNumberOrNot(String s) {
		boolean b=true;
		try {
			Integer.parseInt(s);
			
		} catch (Exception e) {
			b=false;
		}
		if(b) {
			System.out.println("Enter Number Contains digits only");
		}else {
			System.out.println("Enter Number Not contains Digit Only");
		}
		
	}
	
	

}
