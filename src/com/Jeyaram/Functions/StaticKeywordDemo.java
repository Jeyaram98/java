package com.Jeyaram.Functions;

//Static cannot be applied to a class

public class StaticKeywordDemo {

	public static void main(String[] args) {
		//Static methods need no objects to call them
		company.getFounder();
	}

}

class company{
	static void getFounder(){
		System.out.println("Thomas J.Watson");
	}
}