package ch01;

import java.util.Scanner;

public class JumSoo {
	
	public static void main(String[] args) {
		
		String name;
		int java, html, jsp, db, points;  
		double average;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요~! : ");
		name = scan.next();
		System.out.print("Java 점수를 입력해주세요~! : ");
		java = scan.nextInt();
		System.out.print("HTML 점수를 입력해주세요~! : ");
		html = scan.nextInt();
		System.out.print("JSP 점수를 입력해주세요~! : ");
		jsp = scan.nextInt();
		System.out.print("DB 점수를 입력해주세요~! : ");
		db = scan.nextInt();
		scan.close();
		
		points = java + html + jsp + db;
		average = points / 4;
		
		System.out.println("======================================================");
		System.out.println("이름\tJava\tHTML\tJSP\tDB\t총점\t평균");
		System.out.println("------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.1f\n",name ,java, html, jsp, db, points, average );
		System.out.println("======================================================");
		
		
		
	}

}
