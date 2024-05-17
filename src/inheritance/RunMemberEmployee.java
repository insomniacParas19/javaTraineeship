package inheritance;

public class RunMemberEmployee {

	public static void main(String[] args) {
		Employee emp= new Employee();
		
		emp.name= "Sandeep Lamichhane";
		emp.age=22;
		emp.phoneNumber="9836782999";
		emp.address= "Ktm";
		emp.salary=50000;
		emp.specialization="Spin Bowler";
		
		System.out.println("Employee details:");
		emp.printDetails();
		
		System.out.println("----------------------------");
		
		Manager mgr = new Manager();
		
		mgr.name= "Sandeep Lamichhane";
		mgr.age=22;
		mgr.phoneNumber="9836782999";
		mgr.address= "Ktm";
		mgr.salary=50000;
		mgr.department="Nepal Cricket";
		
		System.out.println("Manager details:");
		mgr.printDetails();
		
		
	}
}
