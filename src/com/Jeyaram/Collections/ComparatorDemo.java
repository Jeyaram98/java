package com.Jeyaram.Collections;

import java.util.Comparator;
import java.util.TreeSet;

//When you send a class file to someone , they can't run the program if implements comparable is not used
//Also you can't modify a class file
//So we use Comparator
public class ComparatorDemo {

	public static void main(String[] args) {

		TreeSet<College> tset = new TreeSet<>(new CollegeComparator());
		
		tset.add(new College("TCE", "Madurai", "Tamilnadu"));
		tset.add(new College("RV College of Engineering", "Bangalore", "Karnataka"));
		tset.add(new College("VIT", "Chennai", "Tamilnadu"));
		tset.add(new College("BIT", "Mesra", "Jharkhand"));
		
		System.out.println(tset);
	}

}
//We need to create a new class for comparator , As comparator is used when we do not have the source file
class CollegeComparator implements Comparator<College>{
	
	public int compare(College clgone, College clgtwo) {
		return  clgone.getCity().compareTo(clgtwo.getCity());
	};
}

class College{
	String name,city,state;
	
	public College(String name, String city, String state) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", city=" + city + ", state=" + state + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}