package ch05;

import java.util.Scanner;

public class ArrayScanScore {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		int m[] = new int[sc.nextInt()];
		int tot = 0;
		double avg = 0.0;
		
		for(int i : m) {
			System.out.print("성적을 입력하시오 : ");
			
			m[i] = sc.nextInt();
			
			for(int a : m) {
				
				tot += a;
			}
		}
		
		avg = (double)tot / m.length;
		
		sc.close();
		
		System.out.println("총점은" + tot +"점 입니다.");
		System.out.println("평균 성적은" + String.format("%.1f", avg) + "점 입니다.");
		
	}
	

}
