package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
	
	public static void main(String[] args) {
		
		String name[] = new String[2];
		int kor[] = new int[2];
		int eng[] = new int[2];
		int mat[] = new int[2];
		int tot[] = new int[2];
		double avg[] = new double[2];
		double tot_avg = 0;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("2명의 학생의 국어, 영어, 수학 점수를 각각 입력하세요!");
		
		for(int i = 0; i < 2; i++) {
			
			System.out.print("이름 : ");
			name[i] = inp.next();
			System.out.print("국어 점수 : ");
			kor[i] = inp.nextInt();
			System.out.print("영어 점수 : ");
			eng[i] = inp.nextInt();
			System.out.print("수학 점수 : ");
			mat[i] = inp.nextInt();
			
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;
			tot_avg += avg[i];
		}
		
		for(int i = 0; i < 2; i++) {
			
			System.out.println(String.format("이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.1f\n", name[i], kor[i], eng[i], mat[i], tot[i], avg[i]));
		}
		
		System.out.println("============");
		System.out.println("학급평균 : " + String.format("%.1f", tot_avg / 5));
	}
}
