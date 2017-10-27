package com.acc.controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class RestPointcut {



	@Before("allControlerPointcut()")
	public void allControllerAdvice() {
		System.out.println("Before executing Service Methods");
	}
	
	
	@After("allControlerPointcut()")
	public void allControllerAdviceAfter() {
		System.out.println("After executing Service Methods");
	}
	
	@Before("allServicePointCut()")
	public void allServicesAdvice() {
		System.out.println("Before executing Controller Methods");
	}
	
	/*@Around("allDaoPointcut()")
	public void allDAOAdvice() {
		System.out.println("BEFORE ANDAFTER executing dao Methods");
	}*/
	
	/*@Around("allServicePointCut()")
	public void allServicesAdviceAfter() {
		System.out.println("AROUND executing Controller Methods");
	}*/

	// Pointcut to execute on all the methods of classes in a package
	@Pointcut("within(com.acc.controller.*)")
	public void allControlerPointcut() {}
	
	
	@Pointcut("within(com.acc.services.*)")
	public void allServicePointCut() {}
	
	
	/*@Pointcut("within(com.acc.dao.DataDaoimpl*)")
	public void allDaoPointcut() {}*/
	
}
