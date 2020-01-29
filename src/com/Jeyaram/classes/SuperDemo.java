package com.Jeyaram.classes;

public class SuperDemo {

	public static void main(String[] args) {

		ServiceCompany sc = new ServiceCompany();
		
	}

}

class Company{

	public Company() {
		// source - Generate constructor from superclass
		
		//All classes are a child of object class
		
		super(); //goes to the constructor of object class
		
		//Generates from an object when there is no parent class
		//Check it by holding Ctrl and click super
		
		//Even if we have our own constructor, the compiler creates a constructor( super(); ) on its own
		
		System.out.println("Company.Company()");
	}
	void info() {
		System.out.println("Company.info()");
	}
	
}

class ServiceCompany extends Company{

	public ServiceCompany() {
		
		super(); //This super goes to the constructor of company. If parent constructor has an argument you need to call that only
				 //if the parent constructor has an argument error will be shown
		// Generates from the class company
		//Check it by holding Ctrl and click super
	}
	
	
}