package com.Jeyaram.Miscallaneous;

public class SystemDemo {

	public static void main(String[] args) {

		String name="Jeyaram";
		String college ="TCE";
		
		System.out.println("Output");
		System.err.println("Warning");
		//syst shows where the function is to be executed
		System.out.println("SystemDemo.main()");
		
		System.out.println("Employee "+name+"'s Offer letter is sent to "+college+".");
		System.out.printf("Employee &s's Offer letter is sent to &s.",name,college);
	}

}
