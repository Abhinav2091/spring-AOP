package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAdvice {
	
	//throwing and ThrowAble need to same
	@AfterThrowing(pointcut = "execution(* *.findAccount(..))",throwing = "theException" )
	public void AfterThrowingAdvicecall(Throwable theException)
	{
		System.out.println("Inside AfterThrowingAdvicecall to check the Exception::"+theException);
	}

}
