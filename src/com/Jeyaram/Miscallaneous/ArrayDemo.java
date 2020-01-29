package com.Jeyaram.Miscallaneous;

public class ArrayDemo {

	static int[] marks;
	static int value;
	public static void main(String[] args) {
		//String[] args is a command line argument
		
		//Integer is primitive but Integer array is an object
		
		//Standard Initialization
		marks = new int[5];
		marks[0] = 55;
		marks[1] = 56;
		marks[2] = 57;
		marks[3] = 58;

		System.out.println(value); //0 is displayed if value not initialized
		System.out.println(marks); //null is displayed if marks is not initialized
								   //if marks is given memory size, it displays the object reference in the stack memory ( [I@15db9742 )
		
		//Values are given automatically by the compiler as the variables are static
		
		//Dynamic Initialization
		float[] appraisal = {20.7f , 10.1f , 7.8f , 9.6f};
		
		System.out.println(appraisal[4]); //Index out of bound exception
	}

}
