package ch05;

public class ArrayScore2D {

	public static void main(String[] args) {
		
		int [][] score =  {
				{80, 90, 100},
				{70, 60, 95},
				{88, 77, 66},
				{99, 89, 95},
				{100, 60, 50}};
		char grade;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i = 0; i < score.length; i++) {
			
			int sum = 0;
			double avg = 0.0;
			
			System.out.printf("%d\t",i+1);
			for(int j = 0; j < score[i].length; j++) {
				
				sum += score[i][j];
				
				System.out.printf("%d\t",score[i][j]);
			}
			avg = sum / score[i].length;
			if(avg >= 90) {
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
			System.out.printf("%d\t%.1f\t%s\n", sum, avg, grade);
		}
	}
}
