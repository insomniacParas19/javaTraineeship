package corejava;

import java.util.Scanner;

public class AreaVolumeCalc {

	public static double getArea(double l, double b) {
	double Area=l*b;
	return Area;
	}
	
	public static double getVolume(double Area, double h) {
		double Volume=Area*h;
		return Volume;  
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length(l)");
		double length =sc.nextDouble();
		
		System.out.println("Enter the breadth(b)");
		double breadth =sc.nextDouble();
		
		double Area = getArea(length, breadth);
		
		
		System.out.println("Area is:"+Area);
		
		
		System.out.println("Enter the height(h)");
		double height =sc.nextDouble();
		
		double Volume = getVolume(Area, height);
		System.out.println("Volume is:"+Volume);
		
		
		
		
	}
}
