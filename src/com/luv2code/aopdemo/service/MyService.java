package com.luv2code.aopdemo.service;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class MyService {
	
	public void helloWorld()
	{
		System.out.println("------------Hello World from class::>>"+getClass());
	}
	
	public boolean doSomething(Account account,boolean flag,int[] thearray)
	{
		
		return true;
		
	}

}
