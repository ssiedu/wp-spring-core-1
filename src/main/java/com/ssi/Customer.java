package com.ssi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private int code;
	private String name;
	
	
	private Address address;
	private List<String> cards;
	
	public List<String> getCards() {
		return cards;
	}
	public void setCards(List<String> cards) {
		this.cards = cards;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [code=" + code + ", name=" + name + ", address=" + address + ", cards=" + cards + "]";
	}
	
	
}
