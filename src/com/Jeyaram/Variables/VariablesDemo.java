package com.Jeyaram.Variables;

public class VariablesDemo {
	
	static int level; //instance variable-Instance for the class
	//static is given to access it inside the main function

	public static void main(String[] args) {
		int count = 10; //Local variable
		System.out.println(count);
		System.out.println(level); // static variables are initialised to 0
		
	}
	void calculate() {
		System.out.println(level);
	}
}
