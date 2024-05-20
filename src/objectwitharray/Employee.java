package objectwitharray;

public class Employee {

	    int id;
	    String name;
	    String company;
	    double salary;
	    String department;
	    String post;
	    String city;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getPost() {
			return post;
		}
		public void setPost(String post) {
			this.post = post;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary
					+ ", department=" + department + ", post=" + post + ", city=" + city + "]";
		}
	    
		 // Method to calculate total salary
	    public static double getTotalSalary(Employee[] employees) {
	        double totalSalary = 0;
	        for (Employee emp : employees) {
	            totalSalary += emp.getSalary();
	        }
	        return totalSalary;
	    }

	    // Method to print employees of a specific department
	    public static void printEmployeesOfDepartment(Employee[] employees, String department) {
	        for (Employee emp : employees) {
	            if (emp.getDepartment().equalsIgnoreCase(department)) {
	                System.out.println(emp);
	            }
	        }
	    }

	    // Method to count employees of a specific department
	    public static int countEmployeesOfDepartment(Employee[] employees, String department) {
	        int count = 0;
	        for (Employee emp : employees) {
	            if (emp.getDepartment().equalsIgnoreCase(department)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Method to count and print employees of a particular city
	    public static int countAndPrintEmployeesOfCity(Employee[] employees, String city) {
	        int count = 0;
	        for (Employee emp : employees) {
	            if (emp.getCity().equalsIgnoreCase(city)) {
	                count++;
	                System.out.println(emp);
	            }
	        }
	        return count;
	    }

	    // Method to calculate total salary of a specific department
	    public static double getTotalSalaryOfDepartment(Employee[] employees, String department) {
	        double totalSalary = 0;
	        for (Employee emp : employees) {
	            if (emp.getDepartment().equalsIgnoreCase(department)) {
	                totalSalary += emp.getSalary();
	            }
	        }
	        return totalSalary;
	    }

	    // Method to find the highest and lowest salary
	    public static void findHighestAndLowestSalary(Employee[] employees) {
	        if (employees.length == 0) return;

	        double highestSalary = employees[0].getSalary();
	        double lowestSalary = employees[0].getSalary();  
	        
	        for (Employee emp : employees) {
	            if (emp.getSalary() > highestSalary) {
	                highestSalary = emp.getSalary();
	            }
	            if (emp.getSalary() < lowestSalary) {
	                lowestSalary = emp.getSalary();
	            }
	        }
	        System.out.println("Highest Salary: " + highestSalary);
	        System.out.println("Lowest Salary: " + lowestSalary);
	    }
}


