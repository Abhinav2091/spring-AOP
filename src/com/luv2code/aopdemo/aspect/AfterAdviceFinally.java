package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdviceFinally {
	
	//have no access to exception
	//will run always
	//but you can use join point.
	@After("execution(* *.findAccount(..))")
	public void AfterAdviceMethodCall()
	{
		System.out.println("Inside After Advice That will get call alwayes.");
	}

}
