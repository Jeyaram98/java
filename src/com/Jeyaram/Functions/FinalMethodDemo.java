package com.Jeyaram.Functions;

public class FinalMethodDemo {
	//You cannot use non static variables inside a static function
	static final int value = 100;

	public static void main(String[] args) {
		System.out.println(value);
		//final variables cannot be changed
		//value = 200;
		System.out.println("Updated value: "+value);
	}

}

class Data{
	void stddata() {
		System.out.println("Data.stddata()");
	}
	final void specdata() {
		System.out.println("Special Data");
	}
}

class CmpnyData extends Data{
	@Override
	void stddata() {
		System.out.println("CmpnyData.stddata()");
	}
	//You cannot override the final function specdata()
}