package com.Jeyaram.Collections;

import java.util.TreeSet;

//Passing object in a list or set

public class TreesetExtensionDemo {

	public static void main(String[] args) {

		TreeSet<Furniture> furnset = new TreeSet<>();
		
		//Classcast exception, class cannot cast to comparable
		//Even if you have variables you need to specify on what variable basis 
		//you are going to order . Hence we use comparable interface
		
		furnset.add(new Furniture("Chair","Plastics"));	//Capital letters come first in ascending order
		furnset.add(new Furniture("chair","Wood"));		// chair and Chair are different as java is case sensitive
		furnset.add(new Furniture("Slab","Stone"));	
		
		Furniture table = new Furniture("Table","Glass");
		furnset.add(table);
		
		System.out.println(furnset);
	}

}

class Furniture implements Comparable<Furniture>{
	
	String name,material;

	
	
	@Override
	public String toString() {
		return "Furniture [name=" + name + ", material=" + material + "]";
	}

	public Furniture(String name, String material) {
		super();
		this.name = name;
		this.material = material;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	//This method is needed if we want to implement comparable
	@Override
	public int compareTo(Furniture another) {
		return name.compareTo(another.getName());
	}
	
	
}
