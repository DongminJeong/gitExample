package ch07;

public class Car {
	//멤버 변수
	String color; // 색상
	int speed;
	int gear;
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear (int g) {
		gear = g;
	}
	
	void speedUp() {
		speed = speed + 10;
	}
	
	void speedDown() {
		speed = speed - 10;
	}

}
