package com.luv2code.aopdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy//spring aop proxy support
@ComponentScan("com.luv2code.aopdemo")//component scan for component and aspect 
public class DemoConfig {

}
