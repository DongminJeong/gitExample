package ch02;

public class CircleArea {
	public static void main(String[] args) {
		final double Pi = 3.14; // 원주율을 상수로 선언
		double radius = 10.0; // 원의 반지름
		double CircleArea = radius * radius * Pi;
		System.out.println("원의 면적 = " + CircleArea);
	}

}
