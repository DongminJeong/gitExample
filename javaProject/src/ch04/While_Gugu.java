package ch04;

import java.util.Scanner;

public class While_Gugu {
	
	public static void main(String[] args) {
		
		int dan;
		int x = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		dan = input.nextInt();
		
		while(x < 10) {
			
			System.out.println(dan + "*" + x + "=" + dan * x);
			x++;
		}
	}
}
