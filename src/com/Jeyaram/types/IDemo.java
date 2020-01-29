package com.Jeyaram.types;

public class IDemo {

	public static void main(String[] args) {
		
		HPPrinter hp = new HPPrinter();
		System.out.println(hp.canprintphotos());
		
		CanonPrinter canon = new CanonPrinter();
		System.out.println(canon.canprintphotos());
		//canon = new HPPrinter is not possible
		
		//Printable p = new Printable() is not possible as interface does not have implementations
		Printable p = new CanonPrinter();
		p = new HPPrinter();
		
		Printable another = new Printable()
		{
			
			@Override
			public boolean canprintphotos()
			{
				System.out.println("IDemo.main(...).new Printable() {...}.canprintphotos()");
				return false;
			}
		}; //Once the program ends the anonymous class is deleted
		//Anonymous class saves memory as it is for one time use
		//After execution the anonymous class memory is deleted
	System.out.println(another.canprintphotos());
	}
}
