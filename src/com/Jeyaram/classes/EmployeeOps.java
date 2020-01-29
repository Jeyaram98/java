package com.Jeyaram.classes;
//Functionality class
public class EmployeeOps {

	//Create employee
	
	int createemployee(Employee emp) {
		System.out.println("Employee getting created: "+emp.getEmpname());
		return (int) (Math.random() *1000); 
		//math.random gives diff values from 0.1 to 0.99
	}
	
	//Retrieve Employee
	
	//Update employee
	
	//Delete employee
}
