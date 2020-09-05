package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.config.DemoConfig;
import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MemershipDAO;


public class MainDemoApp {
	

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring
		AccountDAO theAccountDao = context.getBean("accountDAO", AccountDAO.class);
		MemershipDAO theMemershipDAO =context.getBean("memershipDAO",MemershipDAO.class);

		// call the busness method
		Account account =new Account();
		//theAccountDao.addAccount(account,false);
		//theAccountDao.addAccount();
		//theAccountDao.addSilly();
		theAccountDao.doWork();
		theAccountDao.setName("Abhinav");
		System.out.println(">>>>>>>>>>>>>>Get the value:::::"+theAccountDao.getName());
		
		//System.out.println("------------------lets call agian from diff class---------------------");
		//theMemershipDAO.addAccount();
		//theMemershipDAO.addSilly();
		
		
		
		context.close();
	}

}
