package com.Jeyaram.Strings;

public class StringMethodsDemo {

	public static void main(String[] args) {

		String name = "IBM Corporation";
		
		System.out.println(name.indexOf("B"));
		
		System.out.println(name.substring(4, 9));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.replace(" ", "_"));
		
		System.out.println(name.contains("labs"));
		
		//To split the name
		
		String[] names = name.split(" ");
		for (String string : names) {
			System.out.println(string);
		}
		
		System.out.println("\n----------------------------------------\n");

	}

}
