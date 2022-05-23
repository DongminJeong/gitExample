package ch04;

import java.util.Scanner;

public class TotalScore {
	
	public static void main(String[] args) {
		
		int kor, eng, math, tot;
		double avg;
		String grade;
		String op = "";
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("국어 : ");
			kor = scan.nextInt();
			System.out.print("영어 : ");
			eng = scan.nextInt();
			System.out.print("수학 : ");
			math = scan.nextInt();
			System.out.println();
			tot = kor + eng + math;
			avg = tot / 3.0;
			
		
		if(avg >= 90) {
			grade = "수";
		}else if(avg >= 80){
			grade = "우";
		}else if(avg >= 60) {
			grade = "미";
		}else if(avg >= 40) {
			grade = "양";
		}else {
			grade = "가";
		}
		op += String.format("\t%d\t%d\t%d\t%d\t%.1f\t%s\n", kor, eng, math, tot, avg, grade);
	}
		scan.close();
		
		System.out.println("===========================================================");
		System.out.println("\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("-----------------------------------------------------------");
		System.out.println(op);
		System.out.println("===========================================================");
	}

}
