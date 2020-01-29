package com.Jeyaram.ArrayofObjects;

import java.util.Scanner;
public class EmployeeExec extends EmployeeVar {

	static int count;
	EmployeeVar[] employ = new EmployeeVar[100];
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int choice;
		
		EmployeeExec e = new EmployeeExec();
		
		for(;;) {
			System.out.println("************************Welcome***********************\n\n");
			System.out.println("What do you want to do?");
			System.out.println("1) Create an employee record");
			System.out.println("2) Retrieve an employee record");
			System.out.println("3) Update an employee record");
			System.out.println("4) Delete an employee record");
			System.out.println("5)Exit");
			
			System.out.println("\nEnter your choice:-");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				e.create();
				break;
			case 2:
				e.retrieve();
				break;
			case 3:
				e.update();
				break;
			case 4:
				e.delete();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}

		}
				
	}
	void delete() {
		int id;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the empid of the employee to be deleted from the record");
		id= Integer.parseInt(s.nextLine());
		
		for(int i=0;i<=count;i++) {
			if(employ[i].empid==id) {
				employ[i].dept = null;
				employ[i].empid = (Integer) null;
				employ[i].name = null;
				employ[i].projname = null;
				
				break;
			}
			System.out.println("Employee record not found!!! Enter Correct id");
		}
		
	}
	void update() {
		int id,ch;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the empid of the employee whose record is to be updated");
		id= Integer.parseInt(s.nextLine());
		for(int i=0;i<=count;i++) {
			if(employ[i].empid==id) {
				System.out.println("Employee name is "+employ[i].name);
				System.out.println("Employee department is "+employ[i].dept);
				System.out.println("The project he is working is "+employ[i].projname);
				
				System.out.println("What do you want to update?");
				System.out.println("1) Department\n2)Project");
				ch=Integer.parseInt(s.nextLine());
					switch (ch) {
					case 1:
						System.out.println("Enter the new updated department:");
						employ[i].dept=s.nextLine();
						break;
					case 2:
						System.out.println("Enter the new updated Project name:");
						employ[i].projname = s.nextLine();
						break;
					default:
						System.out.println("Enter a valid Input");
						break;
					}
				
				break;
			}
			System.out.println("Employee record not found!!! Enter Correct id");
		}
	}
	void retrieve() {
		int id,flag=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the empid of the employee whose record is to be retrieved");
		id= Integer.parseInt(s.nextLine());
		for(int i=0;i<=count;i++) {
			if(employ[i].empid==id) {
				System.out.println("Employee name is "+employ[i].name);
				System.out.println("Employee department is "+employ[i].dept);
				System.out.println("The project he is working is "+employ[i].projname);
				flag =1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Employee record not found!!! Enter Correct id");
		}
	}
	void create() {
		Scanner s = new Scanner(System.in);
		employ[count] = new EmployeeVar();
		int id;
		String name,dept,project;
		
		System.out.println("Enter employee name:");
		name=s.nextLine();
		employ[count].name = name;
		
		System.out.println("Enter employee id:");
		id=Integer.parseInt(s.nextLine());
		employ[count].empid = id;
		
		System.out.println("Enter employee department:");
		dept=s.nextLine();
		employ[count].dept = dept;
		
		System.out.println("Enter the project assigned to him:");
		project=s.nextLine();
		employ[count].projname = project;
		
		System.out.println("Record is created successfully");
		count++;
		
	}
}
class EmployeeVar{
	
	int empid;
	String name,dept,projname;	
}