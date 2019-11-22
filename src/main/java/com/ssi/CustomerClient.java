package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Customer c=context.getBean("customer",Customer.class);
		//c.getCards().add("5678");
		System.out.println(c);
		
		//Customer c1=context.getBean("customer",Customer.class);
		//System.out.println(c1);

	}

}
