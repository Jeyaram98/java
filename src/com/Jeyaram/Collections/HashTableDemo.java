package com.Jeyaram.Collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, Double> empRating = new Hashtable<>(); //Hashtable is synchronized
									//Hence it can be used in concurrent applications(Multiple thread are usin it)
		
		empRating.put(111, 3.17);	//Key and values should not be null
		empRating.put(222, 4.1);	//If key and value is null it throws nullpointer exception
		empRating.put(333, 3.7);
		
		
	}

}
