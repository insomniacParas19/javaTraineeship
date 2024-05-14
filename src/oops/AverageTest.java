package oops;

import java.util.Scanner;

public class AverageTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		double num1= sc.nextDouble();
		double num2= sc.nextDouble();
		double num3= sc.nextDouble();
		
		Average a = new Average();
		a.setNumbers(num1, num2, num3);
		
		a.calcAverage();
		
		a.printAverage();
		
	}
}
