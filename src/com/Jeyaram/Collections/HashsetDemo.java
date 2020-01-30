package com.Jeyaram.Collections;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {

		HashSet cities = new HashSet();
		cities.add("Delhi");
		cities.add("Delhi");
		cities.add("Kolkata");
		cities.add("Bangalore");
		cities.add("Chennai");  //Hashset is not ordered
		
		System.out.println(cities.size());
		System.out.println(cities);
	}

}
