package ch04;

import java.util.Scanner;

public class If_Else_Ex2 {
	public static void main(String[] args) {
		
		int kor;
		int mat;
		int eng;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어");
		kor = scan.nextInt();
		System.out.println("수학");
		mat = scan.nextInt();
		System.out.println("영어");
		eng = scan.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		
		String grade = "";
		if(avg >= 90) {
			grade = "수";
		}
		else if(avg >= 80) {
			grade = "우";
		}
		else if(avg >= 70) {
			grade = "미";
		}
		else if(avg >= 60) {
			grade = "양";
		}
		else {
			grade ="가";
		}
		
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		
		
		
	}

}
