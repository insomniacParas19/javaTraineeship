package oops;

public class Student {

	int roll_no;
	int phone_no;
	String address;
	String name;
	
	void printDetails() {
		
		System.out.println("Roll no.:"+roll_no);
		System.out.println("Name:"+ name);
	}
	
	void printSDetails() {
		System.out.println("Roll no.:"+roll_no);
		System.out.println("Phone no.:"+ phone_no);
		System.out.println("Address:"+ name);
	}
}
