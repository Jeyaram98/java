package com.Jeyaram.Miscallaneous;

public class StaticBlockDemo {

	public static void main(String[] args) {
		
		new Check();
		/*Check c = new Check();
		
		Check d = new Check(); */
	}
}
	class Check{
		
	//Creating a block
		{
			System.out.println("This block is called an instance block");
			System.out.println("This block is called for every object you create");
			System.out.println("---------------------------------------------------------");
		}
	//Creating a static block
	//Static blocks are executed at first before all the blocks
		static {
			System.out.println("This block is called only once");
			System.out.println("**********************************************************");
		}
		public Check() {
			System.out.println("Constructor is executed after the block");
			System.out.println("---------------------------------------------------------");
		}
	}

