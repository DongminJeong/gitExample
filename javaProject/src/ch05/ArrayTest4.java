package ch05;

import java.util.Scanner;

public class ArrayTest4 {
	
	public static void main(String[] args) {
		
		int tot = 0;
		int size;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("배열의 크기를 입력하시오 : ");
		size = scan.nextInt();
		
		int[] scores = new int[size];
		
		for(int i =0; i < scores.length; i++) {
			System.out.println("성적을 입력하세요 : ");
			scores[i] = scan.nextInt();
		}
		for(int i = 0; i < scores.length; i++) {
			tot += scores[i];
		}
		System.out.println("평균 성적은 " + tot / scores.length + "입니다.");
		scan.close();
	}

}
