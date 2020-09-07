package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
public class AfterReturningAdvice {
	
	//returning and method param should have same name.
	
	@AfterReturning(pointcut = "execution(* *.findAccount(..))",returning ="result" )
	public void afterReturningAdvice(List<Account> result)
	{
		System.out.println("In After Returning Ascpect:::"+result);
		
		//modifiey the retun data
		if(!result.isEmpty())
		{
			result.set(0, new Account("Test",567));
		}
	}

}
