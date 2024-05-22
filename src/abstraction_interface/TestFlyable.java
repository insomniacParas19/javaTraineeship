package abstraction_interface;

public class TestFlyable {

	public static void main(String[] args) {
		
		Flyable spacecraft = new Spacecraft();
		Flyable airplane = new Airplane();
		Flyable helicopter = new Helicopter();
		
		spacecraft.fly_obj();
		airplane.fly_obj();
		helicopter.fly_obj();
	}
}
