package com.luv2code.aopdemo.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
public class JoinPointDemo {

	@Before("execution(* doSomething(..))")
	public void useOfJoinPoint(JoinPoint joinPoint) {
		System.out.println("-----useOfJoinPoint");

		// display method Signature
		MethodSignature ms = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method Signature->>" + ms.toString());

		// display method Argument

		// get the argument
		Object[] arg = joinPoint.getArgs();
		// loop in the argument
		for (Object tempArg : arg) {
			// if it is instance of Account then downcaste it
			if (tempArg instanceof Account) {
				Account account = (Account) tempArg;

				System.out.println("::" + account.getAccNo() + "::" + account.getName());

			}

			if (tempArg.getClass().isArray()) {

				System.out.println(Arrays.toString((int[]) tempArg));
			}

			System.out.println(tempArg.toString());
		}
	}

}