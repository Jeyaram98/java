package com.Jeyaram.Miscallaneous;

public class ObjectDemo {

	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		//Some methods are inherited from the object class
		//View the by typing m. and then pressing Ctrl + Space
		m.getType();
		m.screenSize();
		m.toString();  //Object class method
		
		Object mob = new Mobile();
		Keyboard mobKey = new Mobile();
	}

}

class Mobile extends Keyboard {
	void screenSize() {
		
	}
}
class Keyboard {
	void getType() {
		
	}
}
