package abstraction_interface;

public class Circle implements Shape {
	
	 private double radius;
	    private final double PI = 3.14159265359;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI * radius * radius;
	}

}
