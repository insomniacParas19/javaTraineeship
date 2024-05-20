package oops;

public class Rectangle {

	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public void printArea() {
		double area = length * breadth;
		
	System.out.println("Area of rectangle:" +area);
	}
	
	public void printPerimeter() {
		double perimeter = 2 * (length * breadth);
		
		System.out.println("Perimeter of rectangle:" +perimeter);
	}
}
