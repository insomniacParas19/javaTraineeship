package abstraction_interface;

public class TestShape {

	public static void main(String[] args) {
		
		  Shape rectangle = new Rectangle(5, 10);
	        Shape circle = new Circle(7);
	        Shape triangle = new Triangle(6, 8);

	        System.out.println("Area of Rectangle: " + rectangle.getArea());
	        System.out.println("Area of Circle: " + circle.getArea());
	        System.out.println("Area of Triangle: " + triangle.getArea());
	}
}
