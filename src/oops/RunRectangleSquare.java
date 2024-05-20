package oops;

public class RunRectangleSquare {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(4.0,3.0);
		
		rect.printArea();
		rect.printPerimeter();
		
		Square sq = new Square(4.0);
		
		sq.printArea();
		sq.printPerimeter();
		
	}
}
