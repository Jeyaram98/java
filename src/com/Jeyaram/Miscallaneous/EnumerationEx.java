package com.Jeyaram.Miscallaneous;

public class EnumerationEx {

	public static void main(String[] args) {

		String inputday=args[0];
		System.out.println("Entered day:"+inputday);
		
		Days convertedInput = mappingDaystoEnum(inputday);
		System.out.println("Enum map day: "+convertedInput);
		
		//Ignorecase is only used to compare not change 
		//To avoid the problem of upper and lowercase we can use enum
		
		switch (convertedInput) {
		//You can't give multiple cases in a single line case 1 && case 2 (or) case 1,case2 
		case MON:
			System.out.println("Working day");
			break;
		case TUE:
			System.out.println("Working day");
			break;
		case WED:
			System.out.println("Working day");
			break;
		case THUR:
			System.out.println("Working day");
			break;
		case FRI:
			System.out.println("Working day");
			break;
		case SAT:
			System.out.println("Holiday");
			break;
		case SUN:
			System.out.println("Holiday");
			break;
		default:
			System.out.println("Please provide the right value");
			break;
		}
	}

	private static Days mappingDaystoEnum(String day) {
		
		Days days;
		
		String dayagain = day.toLowerCase();
		switch (dayagain) {
		case "mon":
			days = Days.MON;
			break;
		case "tue":
			days = Days.TUE;
			break;
		case "wed":
			days = Days.WED;
			break;
		case "thur":
			days = Days.THUR;
			break;
		case "fri":
			days = Days.FRI;
			break;
		case "sat":
			days = Days.SAT;
			break;
		case "sun":
			days = Days.SUN;
			break;
		default:
			days = null;
			System.out.println("invalid");
			break;
		}
		return days;
	}

}
enum Days{
	MON,TUE,WED,THUR,FRI,SAT,SUN;
}
