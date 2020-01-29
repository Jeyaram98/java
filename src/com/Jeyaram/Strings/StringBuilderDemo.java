package com.Jeyaram.Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {

		String name = "Jeyaram";
		name = name+ ".";
		name = name + "U";
		
		//Here the first two references Jeyaram and Jeyaram. is getting wasted
		//To prevent this we use StringBuffer and StringBuilder
		
		//StringBuffer methods are synchronized , so it is used in threads
		//Hold Ctrl and press Stringbuffer and then click Ctrl+O to open Outline
		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append("IBM");
		sbuf.append("Corporation");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Jeyaram");
		System.out.println(sb);
		
		sb.append(".");
		System.out.println(sb);
		
		sb.append("U");
		System.out.println(sb);
		
		
	}

}
