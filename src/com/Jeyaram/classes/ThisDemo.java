package com.Jeyaram.classes;

public class ThisDemo {

	int count;
	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		td.process();
	}
	void process() {
		
		System.out.println(count);
		setCount(148);
		System.out.println("Updated count:"+count);
	}
	private void setCount(int count) {	
		this.count = count;		//There is ambiguity if same variables are used count = count;
	}
}
