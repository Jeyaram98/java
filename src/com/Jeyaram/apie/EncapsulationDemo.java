package com.Jeyaram.apie;
public class EncapsulationDemo
	{
	public static void main(String[] args)
		{
		System.out.println("EncapsulationDemo.main()");
		Check ck = new Check();
		//After typing ck. in the dropdown you cannot see personalinfo() 
		//System.out.println(ck.CompanyName());
		ck.getinfo();
		//ck.livein();
		}
	}


