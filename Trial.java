package com.java.logical;

public class Trial {

	public static void main(String[] args) {
		new Car().getMilege();
	}

}
class Vehicle{
	public void getMilege() {
		System.out.println("miles");
	}
}
class Car extends Vehicle{
	public void getMilege()throws RuntimeException {
		super.getMilege();
		if(true)
			throw new RuntimeException();
		System.out.println("12 miles");
	}
}
