package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	private String name;

	public String getName() {
		System.out.println("---------getName-------------");
		return name;
	}

	public void setName(String name) {
		System.out.println("---------setName-------------");
		this.name = name;
	}

	public void addAccount(Account theAccount) {
		System.out.println(getClass() + "::::::::Here in my DAO Class:: with Account  Class.");
	}

	public void addAccount(Account theAccount, boolean flag) {
		System.out.println(getClass() + "::::::::Here in my DAO Class:: with Account  Class and boolean FlAG.");
	}

	public void addAccount() {
		System.out.println("Doing my Db work::::::" + getClass());
	}

	public boolean addSilly() {
		System.out.println("Doing my Db work with  boolean reaturn type::::::" + getClass());
		return true;
	}

	public boolean doWork() {
		System.out.println("doWork::Method::::" + getClass());
		return false;
	}
}
