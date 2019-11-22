package com.ssi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Client {

	public static void main(String[] args) {
		
		
		
		System.out.println("Starting Application : ");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Trial obj1=context.getBean("trialObj",Trial.class);
		Trial obj2=context.getBean("trialObj",Trial.class);
		System.out.println(obj1==obj2);
		
		ApplicationContext context1=new ClassPathXmlApplicationContext("spring.xml");
		
		Trial obj3=context1.getBean("trialObj",Trial.class);
		
		
		//Trial obj1=context.getBean("trialObj",Trial.class);
		//Trial obj2=context.getBean("trialObj",Trial.class);
		//obj1.setX(100);
		//System.out.println(obj1);
		//System.out.println(obj1==obj2);
		
		
		
		
		//ApplicationContext context1=new FileSystemXmlApplicationContext("e:/mydata/somefile.xml");
		//Trial obj=context.getBean("trialObj",Trial.class);
		//obj.show();
		
		
		//ClassPathResource resource=new ClassPathResource("spring.xml");
		//FileSystemResource resource=new FileSystemResource("e:/metadata/somefile.xml");
		//BeanFactory beanFactory=new XmlBeanFactory(resource);
		//Trial obj=(Trial) beanFactory.getBean("trialObj");
		//Trial obj=beanFactory.getBean("trialObj",Trial.class);
		//obj.show();
		
		//Trial obj=new Trial();
		//obj.show();
		

		//BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		//Trial obj=(Trial) beanFactory.getBean("trialObj");
		//obj.show();
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//Trial obj=(Trial) context.getBean("trialObj");
		//obj.show();

	}

}
