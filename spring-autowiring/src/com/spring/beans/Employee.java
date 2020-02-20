package com.spring.beans;

public class Employee {

	private String name;
	private float sal;
	private Address addr;
	
	
	public Employee(String name, float sal, Address addr) {
		this.name = name;
		this.sal = sal;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + ", addr=" + addr + "]";
	}
	
	
}
