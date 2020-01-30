package com.Jeyaram.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List; //java.awt.List is used in standalone applications

public class ListDemo {

	public static void main(String[] args) {

		List<Float> appraisalrating = new ArrayList<Float>(); //If you have a parent object with child reference
															//You can change the child reference anytime
		appraisalrating.add(2.7f);
		appraisalrating.add(3.7f);
		appraisalrating.add(4.7f);	//If f is no given it is treated as double
		appraisalrating.add(4.6f);
		
		System.out.println(appraisalrating);
		
		appraisalrating = new LinkedList<>();
		appraisalrating.add(7.7f);
		appraisalrating.add(8.7f);
		appraisalrating.add(9.7f);
		appraisalrating.add(9.6f);
		
		System.out.println(appraisalrating);
		
	}

}
