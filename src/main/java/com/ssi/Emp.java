package com.ssi;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Emp implements InitializingBean, DisposableBean {
	private int code;
	private String name;
	
	public void start() {
		System.out.println("Start of Emp");
	}
	public void stop() {
		System.out.println("Stop of Emp");
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		System.out.println("Setting Code ");
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting Name ");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [code=" + code + ", name=" + name + "]";
	}
	public Emp(int code, String name) {
		System.out.println("Emp 2 Arg Constructor");
		this.code = code;
		this.name = name;
	}
	
	public Emp() {
		System.out.println("Emp No Arg Constructor");
	}
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Executing After Property Set");
		
	}
	public void destroy() throws Exception {
		System.out.println("Destroy Is Invoked");
		
	}
	
}
