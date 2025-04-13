package com.multilevelInheritance;

public class Son extends Father {
	
	public void son(String info3) {
		System.out.println(info3);
	}
	
	public static void main(String[] args) {
		Son info = new Son();
		info.grandfather("I can access Grandfather's Property...");
		info.father("I can access Father's property.....");
		info.son("I can acess mine property");
	}
	
}
