package com.Jeyaram.Collections;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();	//Hashmap is not synchronized. Check its methods on outline
		hm.put(1, "Ram");
		hm.put(null, "Jram");
		hm.put(null, "ram");	//The null value is overrided
		hm.put(3, "Jeyaram");	//It does not allow duplicate key
		
		System.out.println(hm.size());
		System.out.println(hm);
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(6));  //Displays null if key not present
	}

}
