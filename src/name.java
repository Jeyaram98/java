import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fn,ln,full;
		System.out.println("Enter First name:");
		fn= sc.nextLine();
		System.out.println("Enter last name :");
		ln=sc.nextLine();
		System.out.println(fn+" "+ln);
	}
}
