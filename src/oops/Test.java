package oops;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//Student st = new Student();
		Student s1 = new Student();
		
		System.out.println("Enter the phone number:");
		s1.phone_no =scanner.nextInt();
		System.out.println("Enter roll. no.\n");
		s1.roll_no=scanner.nextInt();
		System.out.println("Enter address:\n");
		s1.address = scanner.nextLine();
		
		Student s2 = new Student();
		
		System.out.println("John\n");
		System.out.println("Enter the phone number:\n");
		s2.phone_no =scanner.nextInt();
		System.out.println("Enter roll no.:\n");
		s2.roll_no=scanner.nextInt();
		System.out.println("Enter address:\n");
		s2.address = scanner.nextLine();
		
		//st.roll_no= 2;
		//st.name= "John";
		
		//st.printDetails();
		s1.printSDetails();
		s2.printSDetails();
			
	}
}
