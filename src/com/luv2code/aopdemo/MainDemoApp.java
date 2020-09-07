package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.config.DemoConfig;
import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MemershipDAO;
import com.luv2code.aopdemo.service.MyService;
import com.luv2code.aopdemo.service.TrafficFortuneService;


public class MainDemoApp {
	

	public static void main(String[] args) throws Exception {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring
		AccountDAO theAccountDao = context.getBean("accountDAO", AccountDAO.class);
		MemershipDAO theMemershipDAO =context.getBean("memershipDAO",MemershipDAO.class);
		MyService myservice =context.getBean("myService",MyService.class);
		TrafficFortuneService TrafficFortuneService =context.getBean("trafficFortuneService",TrafficFortuneService.class);

		// call the busness method
		Account account =new Account();
		//account.setAccNo(12345);
		//account.setName("Abhinav");
		//theAccountDao.addAccount(account,false);
		//theAccountDao.addAccount();
		//theAccountDao.addSilly();
		//theAccountDao.doWork();
		//theAccountDao.setName("Abhinav");
		//System.out.println(">>>>>>>>>>>>>>Get the value:::::"+theAccountDao.getName());
		
//		List<Account> accountList=theAccountDao.findAccount();
//		System.out.println("---------Main class after returning------");
//		System.out.println(accountList);
		
		//myservice.helloWorld();
		int[] a= {1,2,3,4};
		//myservice.doSomething(account, true,a);
		
		//System.out.println("------------------lets call agian from diff class---------------------");
		//theMemershipDAO.addAccount();
		//theMemershipDAO.addSilly();
		
		
		//for Around Advice
		
		
		System.out.println("Main Programm call for Around AOP");
		String data=TrafficFortuneService.getFortune();
		System.out.println("called the fortune service::"+data);
		
		
		context.close();
	}

}
