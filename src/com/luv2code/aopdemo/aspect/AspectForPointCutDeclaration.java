package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-2)
public class AspectForPointCutDeclaration {

	//create a point cut once and use it in multiple Advices
	
	@Pointcut("execution(public * doWork())")
	public void reusePointCutDeclaration() {}
	
	//point cut for every Method
	@Pointcut("execution(* *.*(..))")
	public void reusePointCutDeclarationforEveryMethod() {}
	
	//point cut for getter
	@Pointcut("execution(* *.get*(..))")
	public void reusePointCutDeclarationforGetterMethod() {}
	
	//point cut for setter method
	@Pointcut("execution(* *.set*(..))")
	public void reusePointCutDeclarationforSetterMethod() {}
	
	//exclude getter and setter point cut
	@Pointcut("reusePointCutDeclarationforEveryMethod() && !(reusePointCutDeclarationforGetterMethod() || reusePointCutDeclarationforSetterMethod())")
	public void pointCutDeclarationforExcludingSetterAndGetterMethod() {}
	
	//use method name
	@Before("reusePointCutDeclaration()")
	public void beforeAdviceForDoWork()
	{
		System.out.println("----------beforeAdviceForDoWork----------");
	}
	
	@Before("reusePointCutDeclaration()")
	public void beforeAdviceForDoWorkReusePointCut()
	{
		System.out.println("----------beforeAdviceForDoWorkReusePointCut----------");
	}
	
	@Before("reusePointCutDeclarationforEveryMethod()")
	public void pointCutForAllMethods()
	{
		System.out.println("----------------pointcut for every Method----------");
	}
	
	@Before("pointCutDeclarationforExcludingSetterAndGetterMethod()")
	public void pointCutForExcludingSetterAndGetterMethod()
	{
		System.out.println("----------------pointcut excluding getter and setter Method----------");
	}
}


