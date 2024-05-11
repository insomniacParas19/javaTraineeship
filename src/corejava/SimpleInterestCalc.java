package corejava;

import java.util.Scanner;

public class SimpleInterestCalc {
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount(p)");
		double p =sc.nextDouble();
		
		System.out.println("Enter the time(t)");
		double t =sc.nextDouble();
		
		System.out.println("Enter the rate(r)");
		double r =sc.nextDouble();
		
		
		
	}
	
	static void processing(double p, double t, double r){
		
		double si = (p*t*r)/100;
		double amount= si+p;
	}
	
	static void output(double si, double amount) {
		

		System.out.println("Simple interest is:"+si);
		System.out.println("Amount is:"+amount);
	}
	
	public static void main(String[] args) {
		
		input();
	}

}
