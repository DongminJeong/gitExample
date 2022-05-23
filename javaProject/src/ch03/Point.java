package ch03;

import java.util.Scanner;

public class Point {
	public static void main(String[] args) {
		//성적계산 프로그램
		//국어, 영어, 수학 점수를 받아 총점, 평균 출력
		
		String name; // 이름
		int kor, eng, mat, tot;
		double avg;
		
		//입력개체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next(); //문자열 입력
		System.out.print("국어점수 : ");
		kor = scan.nextInt();
		System.out.print("영어 점수 : ");
		eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		mat = scan.nextInt();
		scan.close();
		
		//계산
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		//결과 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.1f",name, kor, eng, mat, tot, avg);
		
		
	}

}
