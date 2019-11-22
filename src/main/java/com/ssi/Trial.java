package com.ssi;

public class Trial {
	
	private int x, y;
	
	
	
	
	
	@Override
	public String toString() {
		return "Trial [x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Trial() {
		System.out.println("Trial Instance Created");
	}
	public void show() {
		System.out.println("just To Test Something");
	}
}
