package ch11;

public class Plane_Boat implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Plane SpeedUp");

	}

	@Override
	public void speedDown() {
		System.out.println("Plane SpeedDown");

	}

	@Override
	public void handle() {
		System.out.println("Plane Handling");

	}

}

class Boat implements Vehicle{
	
	@Override
	public void speedUp() {
		System.out.println("Boat SpeedUp");

	}

	@Override
	public void speedDown() {
		System.out.println("Boat SpeedDown");

	}

	@Override
	public void handle() {
		System.out.println("Boat Handling");

	}
}