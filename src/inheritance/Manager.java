package inheritance;

public class Manager extends Member {

	String department;
	
	public void printDetails() {
		super.printDetails();
		System.out.println("Department:"+department);
	}
}
