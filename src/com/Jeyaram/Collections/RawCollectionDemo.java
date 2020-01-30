package com.Jeyaram.Collections;

import java.util.ArrayList;

public class RawCollectionDemo {

	public static void main(String[] args) {

		ArrayList marks = new ArrayList();
		marks.add(40);
		marks.add("u");	//If you do not use generics it is a raw list , It allows all datatypes
		marks.add(60);
		marks.add(70);
		marks.add(80);
		
		System.out.println(marks);
		
		for (Object object : marks) {
		
			Integer mark = (int) object;
			mark = mark+10;
			System.out.println(mark);
		}
		
	}

}
