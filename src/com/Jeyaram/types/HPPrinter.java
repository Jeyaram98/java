package com.Jeyaram.types;

public class HPPrinter implements Printable {

	@Override
	public boolean canprintphotos() {
		System.out.println("HPPrinter.canprintphotos()");
		return true;
	}

}
