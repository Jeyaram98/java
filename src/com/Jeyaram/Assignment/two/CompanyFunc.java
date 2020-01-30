package com.Jeyaram.Assignment.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Functionality class

public class CompanyFunc {
	
	static int count=0;
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<CompanyVar> obj = new ArrayList<CompanyVar>();
	
	//Create a record
	
	public boolean create() {
		int id ;
		String cn,ch,cf;
		System.out.println("Enter the company ID:");
		id=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the company name:");
		cn = sc.nextLine();
		
		System.out.println("Enter the company Headquarters:");
		ch = sc.nextLine();
		
		System.out.println("Enter the company Founder:");
		cf = sc.nextLine();
		
		obj.add(new CompanyVar(id, cn, cf, ch));
		return true;
	}
	
	//Retrieve a record
	
	void retrieve() {
		int id,flag=0;
		System.out.println("Enter the Company id");
		id = Integer.parseInt(sc.nextLine());
		for (Iterator iterator = obj.iterator(); iterator.hasNext();) 
		{
			CompanyVar companyVar = (CompanyVar) iterator.next();
			if(companyVar.getCid()==id) {
				System.out.println(companyVar);
				flag=1;
				break;
			}
			
		}
		if(flag==0) {
			System.out.println("Check your id");
		}
	}
	
	//Update a record
	
	void update() {
		int id;
		System.out.println("Enter the Company id");
		id = Integer.parseInt(sc.nextLine());
		
		for (Iterator iterator = obj.iterator(); iterator.hasNext();) 
		{
			CompanyVar companyVar = (CompanyVar) iterator.next();
			if(companyVar.getCid()==id) {
		
				int ch;
				System.out.println("1) Name\n2) Headquarters");
				System.out.println("Enter your choice");
				ch=Integer.parseInt(sc.nextLine());
				switch (ch) {
				case 1:
					System.out.println("Enter the new name");
					companyVar.setCname(sc.nextLine());
					break;
					
				case 2:
					System.out.println("Enter the new location");
					companyVar.setChead(sc.nextLine());
					break;
				
				default:
					System.out.println("Invalid input");
					break;
				}
				break;
			}
			
	   }
		
	}

	//Deleting a record
	
	void delete() {
		
		int id;
		System.out.println("Enter the Company id");
		id = Integer.parseInt(sc.nextLine());
		
		for (Iterator iterator = obj.iterator(); iterator.hasNext();) {
			
			CompanyVar companyVar = (CompanyVar) iterator.next();
			if(companyVar.getCid()==id) {
				obj.remove(companyVar);
				break;
			}
			
		}
	}
}
