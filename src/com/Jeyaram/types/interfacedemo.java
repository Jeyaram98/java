package com.Jeyaram.types;

import java.io.Serializable;

public interface interfacedemo {
	int value = 100;
	int add(int first, int second);
	//you can't define the functions //Interface can only be declared
}
interface Info{}
interface Join extends Info{}

class Auto{}
class bus extends Auto{}

class check implements Info, Join , Serializable{
	
}

//one class can implement from two parent interfaces
//There is no ambiguity as we are the one defining the methods
//we are not calling the methods from the parent

abstract class Calculations implements interfacedemo {
	
	}
//when a class is made abstract it need not implement its parent class's methods .
//The implementation is done by the child of the abstract class

