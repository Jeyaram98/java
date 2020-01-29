package com.Jeyaram.types;

public class InterfaceExDemo {

	public static void main(String[] args) {

	}

	class validate implements HardwareValidation, SoftwareValidation {

		@Override
		public boolean validate(int no) { //Not needed if no arguments , one method will be sufficient
			return false;
		}

		@Override
		public boolean validate() {
			System.out.println("Validating....");
			return false;
		}

	}

	interface HardwareValidation {
		boolean validate();
	}

	interface SoftwareValidation {
		boolean validate(int no); //if no arguments then one method is sufficient in class
	}
}
