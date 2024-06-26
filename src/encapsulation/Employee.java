package encapsulation;

public class Employee {

	 private int empId;
	    private String name;
	    private String ssn;
	    private double salary;
	    
	    public Employee(int empId, String name, String ssn, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.ssn = ssn;
	        this.salary = salary;
	    }
	    
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	    
		/* Setter method for name
	    public void setName(String name) {
	        this.name = name;
	    }
	  */  

	    // Method to raise salary
	    public void raiseSalary(double increase) {
	        if (increase > 0) {
	            this.salary += increase;
	        }
	    }
	     // Method to print Employee details
	        public void printEmployee() {
	            System.out.println("Employee ID: " + empId);
	            System.out.println("Name: " + name);
	            System.out.println("SSN: " + ssn);
	            System.out.println("Salary: " + salary);
	        }
}
