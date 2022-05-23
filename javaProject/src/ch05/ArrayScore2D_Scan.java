package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요 : ");
		
		int stu = sc.nextInt();
		int [][] array = new int[stu][3];
		char grade;
		double avg;
		int tot, num;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("국 영 수 점수를 각각 입력하세요 : ");
			
			array [i][0] = sc.nextInt();
			array [i][1] = sc.nextInt();
			array [i][2] = sc.nextInt();
			
		}
		for(int i = 0; i < array.length; i++){
			System.out.println((i + 1) + "번 학생의 점수 : " + array [i][0] + " " + array [i][1] + " " + array [i][2]);
			
		}
		
		System.out.println("");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		
		for(int i =0; i < array.length; i++) {
			tot = array [i][0] + array [i][1] + array [i][2];
			avg = tot / (double)array [i].length;
			num = i + 1;
			
			if(avg >= 90.0) {
				grade = 'A';
			}else if(avg >= 80) {
				grade = 'B';
			}else if(avg >= 70) {
				grade = 'C';
			}else if(avg >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}	
			System.out.println(num +"\t" + array[i][0] + "\t" + array[i][1] + "\t" + array[i][2] + "\t" + tot + "\t" + String.format("%.1f\t", avg) + grade);
		}	
	}
}


