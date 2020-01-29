package com.Jeyaram.Functions;

public class FinalClassDemo {

	public static void main(String[] args) {
		additionalinfo ai = new additionalinfo();
		ai.getinfo();
	}

}

final class info{
	void getinfo() {
		System.out.println("info.getinfo()");
	}
}
//If info is final....final class info.....then its methods cannot be inherited
//or no class can inherit from info
class additionalinfo{
	void getinfo() {
		//to use a final class method in another class
		//create an object for the final class and use it
		info i = new info();
		i.getinfo();
		
	}
}