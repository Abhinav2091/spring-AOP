package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.config.DemoConfig;
import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MemershipDAO;
import com.luv2code.aopdemo.service.MyService;


public class MainDemoApp {
	

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring
		AccountDAO theAccountDao = context.getBean("accountDAO", AccountDAO.class);
		MemershipDAO theMemershipDAO =context.getBean("memershipDAO",MemershipDAO.class);
		MyService myservice =context.getBean("myService",MyService.class);

		// call the busness method
		Account account =new Account();
		account.setAccNo(12345);
		account.setName("Abhinav");
		//theAccountDao.addAccount(account,false);
		//theAccountDao.addAccount();
		//theAccountDao.addSilly();
		//theAccountDao.doWork();
		//theAccountDao.setName("Abhinav");
		//System.out.println(">>>>>>>>>>>>>>Get the value:::::"+theAccountDao.getName());
		
		//myservice.helloWorld();
		int[] a= {1,2,3,4};
		myservice.doSomething(account, true,a);
		
		//System.out.println("------------------lets call agian from diff class---------------------");
		//theMemershipDAO.addAccount();
		//theMemershipDAO.addSilly();
		
		
		
		context.close();
	}

}
