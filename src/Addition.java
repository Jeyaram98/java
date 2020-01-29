import java.util.*;
public class Addition {
	public static void main(String[] args) {
		String dec;
		add();
		for(;;) {
			Scanner s = new Scanner(System.in);
			System.out.println("do you wish to continue:");
			dec = s.nextLine();
			if(dec.equalsIgnoreCase("Yes"))
				add();
			else if(dec.equalsIgnoreCase("exit"))
				System.exit(0);
			else
				System.out.println("Invalid Input Enter yes to continue and exit to stop");
		}
	}
	static void add() {
		int first,second;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		first=sc.nextInt();
		System.out.println("Enter the second number:");
		second=sc.nextInt();
		System.out.println(first + second);
	}
}
