package com.Jeyaram.Constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		
	//Default constructor
		Computer dell = new Computer();
		dell.setManufacture("Dell Inc");
		dell.setModel("Lattitude");
		dell.setCost(70000);
		System.out.println(dell); //If toString() is not there it prints the memory address of the object
		
	//User-defined constructor
		Computer ibm = new Computer("IBM","Thinkpad",99000);
		 System.out.println(ibm);
	}
}

class Computer {
	String manufacture;
	String model;
	long cost;

	// right click - Source - Generate toString
	public String toString() {
		return "Computer [manufacture=" + manufacture + ", model=" + model + ", cost=" + cost + "]";
	}

	public Computer() {
		super();
	}

	public Computer(String manufacture, String model, long cost) { //When we create a constructor the compiler will not provide constructor....It shows error in line 6 
		super();
		this.manufacture = manufacture;
		this.model = model;
		this.cost = cost;
	}
//Right click - Source - Generate setters and getters
//Get and Set are needed when we have empty constructors(no arguments)
	
	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

}