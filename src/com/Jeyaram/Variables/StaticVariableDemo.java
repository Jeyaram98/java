package com.Jeyaram.Variables;

public class StaticVariableDemo {

	public static void main(String[] args) {
		Vendor iiht = new Vendor();
		iiht.createVendor("IIHT Tech");
		iiht.totalVendors();
		
		Vendor hungerbox = new Vendor();
		hungerbox.createVendor("HungerBox");
		hungerbox.totalVendors();
		
		Vendor srs = new Vendor();
		srs.createVendor("SRS Travels");
		srs.totalVendors();
	}

}

class Vendor{
	static int totalvendors;
	//If int totalvendors is given then the value of totalvendors will 
	//always be 1 when a new vendor is created
	//Because each object will have a separate totalvendors variable
	void createVendor(String name) {
		System.out.println("Creating the vendor.."+name);
		totalvendors++;
	}
	void totalVendors() {
		System.out.println("No of vendors :"+totalvendors);
	}
}