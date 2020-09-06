package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//order work on different aspect

@Aspect
@Component
@Order(-1)
public class AspectAdviceOrdering {
		
	
		@Before("com.luv2code.aopdemo.aspect.AspectForPointCutDeclaration.reusePointCutDeclarationforEveryMethod()")
		public void pointCutForAllMethodsOrder()
		{
			System.out.println("----------------pointcut for every Method order 1----------");
		}
	

}
