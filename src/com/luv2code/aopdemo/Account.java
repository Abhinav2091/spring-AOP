package com.luv2code.aopdemo;

public class Account {

	private String name;
	private int accNo;

	public Account() {
		
	}
	
	public Account(String name, int accNo) {
		super();
		this.name = name;
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accNo=" + accNo + "]";
	}

	
	
}
