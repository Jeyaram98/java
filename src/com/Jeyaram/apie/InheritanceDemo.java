package com.Jeyaram.apie;

/**
 * @author JeyaramUdhayasuriyan
 *
 */
public class InheritanceDemo {

	public static void main(String[] args) {
		Calc cal = new Calc();
		cal.add(20,30);
	}
}

//class Calc extends SciCalculation,StdCalculation{} is not possible as it leads to ambiguity
class Calc extends StdCalculation{
	/*void add(int firstValue,int secondValue)
	{
		System.out.println("childsum :"+(firstValue + firstValue + secondValue));
	}*/
	// first calc second std third sci
	
}

class SciCalculation{
	void add(int firstValue,int secondValue)
	{
		System.out.println("stdsum :"+(firstValue + firstValue + secondValue));
	}
}

class StdCalculation extends SciCalculation{
		void add(int firstValue,int secondValue)
		{
			System.out.println("stdsum :"+(firstValue + secondValue));
		}
	}


