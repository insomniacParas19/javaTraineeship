package objectwitharray;


public class RunEmployeeArray {
	
	

	public static void main(String[] args) {
		Employee emp[] = new Employee[10];
		 
		
		for(int i=0; i<emp.length;i++) {
			
			Employee e = new Employee();
			e.setId(i+1);
			e.setName("Puran Bam");
			e.setCompany("InsoTech");
			e.setSalary(50000.0);
			e.setDepartment("IT");
			e.setPost("CyberSecurity Analyst");
			e.setCity("Mahendranagar");
			
			emp[i] = e;
		}
		for(Employee em : emp) {
			System.out.println(em);
			 
		}
		
		double totalSalary=0.0;
		for (Employee e : emp) {
            totalSalary += e.getSalary();
        }
		
		System.out.println("\n----Employee Status Info------\n");
		
		  System.out.println("Total Salary of all Employees: " + totalSalary);
	

	}
}
