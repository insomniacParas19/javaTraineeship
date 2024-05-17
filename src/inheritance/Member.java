package inheritance;

public class Member {

	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

/*	public Member(String name, int age, String phoneNumber, String address, double salary) {
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
	}
*/	
	public void printSalary() {
		System.out.println("Salary:"+salary);
	}
	
	public void printDetails() {
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+name);
		System.out.println("Phone Number:"+name);
		System.out.println("Address:"+name);
		printSalary();
	}
}
