package ch09;

public class SportsCarTest {
	
	public static void main(String[] args) {
		
		SportsCar obj = new SportsCar();
		obj.speed = 10; // car의 멤벼변수
		obj.setSpeed(60); // car의 멤버메소드
		obj.setTurbo(true); //sportscar의 멤버메소드
		//정리 상속받는 객체는 "부모님꺼는 내꺼"
	}

}
