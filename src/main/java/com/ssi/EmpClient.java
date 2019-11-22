package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpClient {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Emp emp=context.getBean("emp",Emp.class);
		System.out.println(emp);
		//AbstractApplicationContext
		context.registerShutdownHook();
	}

}
