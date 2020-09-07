package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Account> findAccount()
	{
		List<Account> accountList = new ArrayList<>();
		
		accountList.add(new Account("Abhinav",1));
		accountList.add(new Account("Aju",2));
		accountList.add(new Account("Ajay",3));
		accountList.add(new Account("Himanshu",4));
		
		//for After Throwing
//		if(!accountList.isEmpty())
//		throw new ArrayIndexOutOfBoundsException("Just a test Exception.");
		
		return accountList;
		
	}
}
