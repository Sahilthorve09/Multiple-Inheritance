package com.multilevelInheritance;

public class Father extends Grandfather {
	
	public void father(String info2) {
		System.out.println(info2);
	}
	
	public static void main(String[] args) {
		Father info = new Father();
		info.grandfather("I can acess grand Father Property...");
		info.father("I can acess mine property also...");
	}
	
	
}
