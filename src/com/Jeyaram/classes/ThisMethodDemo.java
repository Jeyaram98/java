package com.Jeyaram.classes;

public class ThisMethodDemo {

	public static void main(String[] args) {
		
		computer dell = new computer("Dell", "Vostro", (byte) 16);//16 is considered as an integer
		System.out.println(dell); //If toString() is not there it will just print the object reference
	}

}

class computer {
	
	String manufacturer,model;
	byte ram;
	
	public computer() {

	}

	public computer(String manufacturer, String model) { 
		//In the above line manu... and model are arguments for the constructor not the instance variables
		this.manufacturer = manufacturer; //This refers to the value of the current object
		this.model = model;
	}

	public computer(String manufacturer, String model, byte ram) {
		this(manufacturer, model); //This here calls the constructor computer(String,String) 
								   //Check it by holding ctrl and clicking it
		this.ram = ram;
	}

	@Override 
	//It is overriden from the parent class object
	public String toString() {
		return "computer [manufacturer=" + manufacturer + ", model=" + model + ", ram=" + ram + "]";
	}
	
	
	
}
