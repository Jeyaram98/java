package com.Jeyaram.Strings;

public class StringsDemo {

	public static void main(String[] args) {

		String name = "IBM"; //IBM is string literal
				//A location in heap is created as "IBM" and is referenced by name
		System.out.println(name);
		
		//String is immutable
		//That is you cannot change the internal memory of the string
		
		name = name+"Corp"; //A new location is created in heap as "IBM Corp" and is referenced by the name object 
							//The reference is removed from "IBM" and "IBM" is sent for garbage collection
		System.out.println(name);
		
		String myname = "Jeyaram U"; //Stored in String pool
		String fullname = new String("Jeyaram U"); //Stored in heap,outside string pool
		
		System.out.println(myname==fullname);
		//It displays zero as it checks the object reference(Present in Stack),not the string
		System.out.println(myname.equals(fullname));
		//It compares the two strings,whose location is in the heap(String pool)
		//Two identical strings will share a same location in heap, New location is not created
	}

}
