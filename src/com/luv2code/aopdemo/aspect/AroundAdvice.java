package com.luv2code.aopdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdvice {

	private static Logger logger = Logger.getLogger("AroundAdvice.class");

	@Around("execution(* *.getFortune(..))")
	public Object aroundAdviceMethodCall(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		Object result = null;
		// print out the method we are advising on
		String method = proceedingJoinPoint.getSignature().toString();
		logger.info("**************************Around advice method name:::" + method);

		// get begin timestamp
		long begin = System.currentTimeMillis();

		//either we can handle exception by using try catch in Around block.
		try {
			// let execute the method
			result = proceedingJoinPoint.proceed();
		} catch (Exception e) {
			logger.warning(e.getMessage());
			result = "Nothing to do exception occur";
			
			//or we can re throw the exception. because we handled it else let it crash the code
			throw e;
		}

		// get the end point
		long end = System.currentTimeMillis();

		logger.info("*************Time taken by Method " + ((end - begin) / 1000.0) + "secounds");

		return result;
	}

}
