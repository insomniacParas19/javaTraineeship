package corejava;

import java.util.Scanner;

public class EmployeeSalaryCalc {
	
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        String role = "CEO"; // Change this to test different roles
	        double totalSalary = getEmployeeSalary(role);
	        System.out.println("Total salary for " + role + ": " + totalSalary);
	    }

	    // Method to get employee salary based on role using switch-case
	    public static double getEmployeeSalary(String role) {
	        double baseSalary;
	        double bonusPercentage;

	        switch (role.toUpperCase()) {
	            case "MD":
	                baseSalary = 100000;
	                bonusPercentage = 20;
	                break;
	            case "CEO":
	                baseSalary = 150000;
	                bonusPercentage = 25;
	                break;
	            case "MANAGER":
	                baseSalary = 80000;
	                bonusPercentage = 15;
	                break;
	            case "HELPER":
	                baseSalary = 30000;
	                bonusPercentage = 5;
	                break;
	            default:
	                throw new IllegalArgumentException("Unknown employee role: " + role);
	        }

	        return calculateTotalSalary(baseSalary, bonusPercentage);
	    }

	    // Method to calculate total salary based on base salary and bonus percentage
	    public static double calculateTotalSalary(double baseSalary, double bonusPercentage) {
	        double bonus = baseSalary * (bonusPercentage / 100); // Calculate bonus amount
	        return baseSalary + bonus; // Return total salary
	    }
}
