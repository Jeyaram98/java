package com.Jeyaram.Assignment.two;

import java.util.Scanner;

//Execution class

public class CompanyExec extends CompanyFunc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CompanyExec call = new CompanyExec();
		
		int choice;
		for(;;) {
			System.out.println("What do you want to do");
			System.out.println("1) Create a record\n2) Retrieve a record\n3) Update a record\n4) Delete a record\n5) Exit");
			choice=Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				call.create();
				break;
			case 2:
				call.retrieve();
				break;
			case 3:
				call.update();
				break;
			case 4:
				call.delete();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}

}
