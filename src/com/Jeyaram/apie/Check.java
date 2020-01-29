package com.Jeyaram.apie;
//If public class is not given as public you cannot access it in other packages
public class Check {
	int count;
	String name;

	void getinfo() // Package level
	{
		personalinfo();
		System.out.println("Jeyaram");
	}

	public void livein() {
		System.out.println("Bangalore,India");
	}

	protected String CompanyName() {
		return "IBM Corp";
	}

	private void personalinfo() {
		System.out.println("Jeyaram2");
	}
	// See the symbol difference in Outline(Right corner)
}
