package com.Jeyaram.classes;
//Execution class
public class EmployeeDemo {

	public static void main(String[] args) {
		System.out.println("Employee Application...");
		Employee jram = new Employee();
		//jram.setEmpid(123);
		//By default toString() sets the empid to 0
		jram.setEmpname("Jeyaram");
		jram.setEmpdept("IT");
		jram.setProjectname("Redhat cloud");
		
		System.out.println(jram.toString());
		
		EmployeeOps crud = new EmployeeOps();
		int empid = crud.createemployee(jram); //Object is passed as an argument
		System.out.println("Generatd id is "+empid);
		
		jram.setEmpid(empid);
		System.out.println(jram);
	}

}
