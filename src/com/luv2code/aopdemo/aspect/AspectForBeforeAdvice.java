package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectForBeforeAdvice {

//point cut expression explanation
//execution(Modifiers-pattern? return-type-pattern declaring-type-patter? method-name-pattern(param-pattern) throws)
//?= optional
//*=wildcard
//declaring-type-patter=class name
//for param-pattern
// () -> no arg
//	(*) -> one arg
	// (..) -> matches with 0 or more arg

//@Before advice for addAccount in any class
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("Custome code in Advice :: beforeAddAccountAdvice  :: No parameter");
	}

	//// @Before advice for addAccount in AccountDAO class
	// need fully qualified Class name
	@Before("execution(public void  com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdviceForAccountDAO() {
		System.out.println("Custome code in Advice :: No parameter :: only For AccountDAO Class");
	}

	// use wild card for method
	@Before("execution(public void add*())")
	public void beforeAddAccountAdviceforAnyMethod() {
		System.out.println("Advice for any Method starts with add>>>>>>>>>>>>");
	}
	
	//for return type
	@Before("execution(boolean add*())")
	public void beforeAddAccountAdviceforBooleanReturnType() {
		System.out.println("boolean return type pointcut");
	}
	
	@Before("execution(* add*(com.luv2code.aopdemo.Account))")
	public void beforeAddAccountAdviceforAccountAsInput() {
		System.out.println("beforeAddAccountAdviceforAccountAsInput");
	}
	
	@Before("execution(* add*(com.luv2code.aopdemo.Account,..))")
	public void beforeAddAccountAdviceforAccountAsInputWithAnyNumberOfArgument() {
		System.out.println("beforeAddAccountAdviceforAccountAsInputWithAnyNumberOfArgument");
	}
	
	@Before("execution(* add*(..))")
	public void beforeAddAccountAdviceforAnyNumberOfArgument() {
		System.out.println("beforeAddAccountAdviceforAnyNumberOfArgument");
	}
	
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAdviceforAnyNumberOfArgumentInGivenPackage() {
		System.out.println("-------beforeAdviceforAnyNumberOfArgumentInGivenPackage---------");
	}
	

}
