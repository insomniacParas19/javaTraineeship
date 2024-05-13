package oops;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Student st = new Student();
		Student sam = new Student();
		Student john = new Student();
		System.out.println("Enter the phone number:");
		sam.phone_no =scanner.nextInt();
		System.out.println("Enter roll. no.\n");
		sam.roll_no=scanner.nextInt();
		System.out.println("Enter address:\n");
		sam.address = scanner.nextLine();
		
		System.out.println("John\n");
		System.out.println("Enter the phone number:\n");
		john.phone_no =scanner.nextInt();
		System.out.println("Enter roll no.:\n");
		john.roll_no=scanner.nextInt();
		System.out.println("Enter address:\n");
		john.address = scanner.nextLine();
		
		//st.roll_no= 2;
		//st.name= "John";
		
		//st.printDetails();
		sam.printSDetails();
		john.printSDetails();
			
	}
}
