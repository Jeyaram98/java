package com.Jeyaram.Collections;

import java.util.ArrayList;

public class ArraylistDEmo {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<String>();  // <> This is called generics , Without this you can add all datatypes into the list
		cities.add("Delhi");
		cities.add("Delhi");
		cities.add("Kolkata");	//Array list memory is allocated in sequence (1001,1002,1003....)
		cities.add("Mumbai");
		cities.add("Chennai");	//List is ordered
		
		System.out.println(cities.size());
		System.out.println(cities);
		
	}

}
