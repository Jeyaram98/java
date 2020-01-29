package com.Jeyaram.apie;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		int pCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Available processors:"+pCount);

		Check c = new Check();
		c.getinfo();
	}
//Ctrl+Click the function , It displays the source file(Java is an open source s you can see the code)
}
