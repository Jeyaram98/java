package com.Jeyaram.Collections;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {

		TreeSet cities = new TreeSet();
		cities.add("Delhi");
		cities.add("Delhi");
		cities.add("Kolkata");
		cities.add("Bangalore");
		cities.add("Chennai");  //Treeset is ordered , Ascending order
		
		System.out.println(cities.size());
		System.out.println(cities);
	}

}
