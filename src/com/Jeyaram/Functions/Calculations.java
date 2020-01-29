package com.Jeyaram.Functions;

public abstract class Calculations {
	
	
	
	public static int addition(int first,int last) {
		return first + last;
	}
	
	protected final int subraction(int first,int last) {
		return first - last;
	}
	
	//Access-specifier nonaccess-specifier return-type func-name 
	
	synchronized int multiplication(int first,int last) {
		return first * last;
	}
	
	//Native methods do not specify a body
	
	private native int division(int first,int last);

	//To have an abstract method you need to have it inside an abstract class
	
	abstract int remaining(int first,int last);
}
