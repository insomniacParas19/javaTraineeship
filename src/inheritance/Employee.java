package inheritance;

public class Employee extends Member{
	
	String specialization;
	
	public void printDetails() {
		super.printDetails();
		System.out.println("Specialization:"+specialization);
	}

}
