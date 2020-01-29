package com.Jeyaram.Miscallaneous;

import java.util.Iterator;

public class ForDemo {

	public static void main(String[] args) {
		
		//args are command line arguments
		/*
		 * Right click and select run as configuration
		 * Go to arguments tab
		 * In the program arguments give the values with space
		 * To give a single string with space use "Jeyaram U"
		 * Apply and run
		 */
		//Iterate over an array with temporary variable
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
			
		}
		System.out.println("-------------------------------------------------------");
		//Iterate over an array or iterable
		for (String string : args) {
			System.out.println(string);
		}
	}

}
