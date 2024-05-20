package oops;

public class Square extends Rectangle {

	public Square(double side) {
		
		super(side, side);
		
	}

	@Override
	public void printArea() {
		double area = length * length;
		// TODO Auto-generated method stub
		System.out.println("Area of square:"+area);
	}

	@Override
	public void printPerimeter() {
		double perimeter = 4 * length;
		// TODO Auto-generated method stub
		System.out.println("Perimeter of square:"+perimeter);
	}
	
	
	
	
	
}
