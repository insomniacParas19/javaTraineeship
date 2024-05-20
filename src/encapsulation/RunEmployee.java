package encapsulation;

public class RunEmployee {

	public static void main(String[] args) {
		 Employee emp = new Employee(1, "Puran Bam", "9806543456", 75000);
	        emp.printEmployee();
	        
	        System.out.println("\n ----After salary raised----\n");
	        
	        emp.setName("Puran Bam");
	        emp.raiseSalary(5000);
	        emp.printEmployee();
	        
	        System.out.println("\n----Manager info----\n");
	        
	     Manager mgr = new Manager(2, "Rakesh Kumar", "9892020983",80000, "IT");
	     mgr.printEmployee();
	     System.out.println("Department:" +mgr.getDeptName());
	    }
	}

