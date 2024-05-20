package oops;

import java.util.Scanner;

public class RunRectSquareArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square[] squares = new Square[10];
		
		for(int i=0; i<squares.length; i++) {
			
			System.out.print("Enter the side length of square"+(i+1)+":");
			double side = sc.nextDouble();
			squares[i]=new Square(side);
		}
		
		System.out.println("------------------------------------");
		for(int i=0; i<squares.length;i++) {
			
			squares[i].printArea();
		}
		sc.close();
	}
}
