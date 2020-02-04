package com.java.logical;

public class ExaceptionTrial38 {

	public static void main(String[] args) {
		try {
			Employee.check();
			System.out.println("completed");
		} catch (RuntimeException e) {
			System.out.println("runtime");
		}

	}

}

class Employee{
	static void check() throws RuntimeException{
		try {
			System.out.println("Checking");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
