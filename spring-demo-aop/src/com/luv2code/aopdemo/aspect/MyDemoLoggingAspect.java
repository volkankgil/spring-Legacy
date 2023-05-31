package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

	/*//@Before("execution(public void addAccount())") // this is pointcut expression
	@Before("execution(public void addAccount())") 
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on Method()");
		
	}*/
	
	/*@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")  // tam sınıf tanımını vererek aspect'i specific hale getirdik.
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on Method()");
		
	}*/
	
	/*@Before("execution(public void add*())") // * vererek aspect'i spesifik hale getirdik. add ile başlayan bütün metodları çalıştıracaktır.
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on Method()");
		
	}*/
	
	@Before("execution(boolean add*())") // modifier yani private mı public mi olacağını yazmak optional.return type'a da * koyar isek herhangii bir return'ü alır.
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on Method()");
		
	}
}
