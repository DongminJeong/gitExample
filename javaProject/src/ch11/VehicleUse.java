package ch11;

public class VehicleUse {
	public static void main(String[] args) {
		Car c = new Car();
		c.speedDown();
		c.speedUp();
		c.handle();
		System.out.println("---------------------");
		
		Plane_Boat p = new Plane_Boat();
		p.speedDown();
		p.speedUp();
		p.handle();
		System.out.println("---------------------");
		
		Boat b = new Boat();
		b.speedDown();
		b.speedUp();
		b.handle();
	}
}
