package com.Jeyaram.Functions;

import java.io.IOException;

public class FunctionDemo {

	int add(int first,int last) {
		int sum;
		sum=first+last;
		return sum;
	}
	//write it as
		//add(int first,int last)......return sum;
		//At last add the return type (int)
		//Its the standard even while reading the function
	
	public static double add(double first,int last) throws IOException {
		double sum = first+last;
		return sum;
	}
	//static is a nonaccess modifier
}
