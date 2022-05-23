package ch07;

public class Car2 {
	
	String color;
	int speed;
	int gear;
	
	void print() {
		System.out.println("차량색상 : " + color);
		System.out.println("차량 속도 : " + speed + "km");
		System.out.println("차량 기어단수 : " + gear + "단");
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	String getColor() {
		return color;
	}

	void setGear(int gear) {
		this.gear = gear;
	}
	public int getGear() {
		return gear;
	}
	

}
