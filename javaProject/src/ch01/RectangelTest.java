package ch01;

import java.util.Scanner;

public class RectangelTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("==============================");
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		a = scan.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		b = scan.nextDouble();
		scan.close();
		System.out.println("직사각형의 넓이는 " + a * b +"입니다.");
		System.out.println("==============================");
		
		
		
	
		
		
	}

}
