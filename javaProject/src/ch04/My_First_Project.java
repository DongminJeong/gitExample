package ch04;

import java.util.Scanner;

public class My_First_Project {
	
	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("메뉴구성");
			System.out.println("==========");
			System.out.println("[1] 한식");
			System.out.println("----------");
			System.out.println("[2] 양식");
			System.out.println("----------");
			System.out.println("[3] 중식");
			System.out.println("==========");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. (죵료 : 0)");
			System.out.println("==========");
			
			String tmp = sc.next();
			menu = sc.nextInt();
			
			if(menu == 0) {
			
				System.out.println("프로그램을 종료합니다.");
			break;
			
			}else if(menu < 1 || menu > 3) {
				
				System.out.println("잘못입력하셨습니다.");
				
				continue;
			}if(menu == 1) {
				for(;;) {
				System.out.println(" (1) 김치찌개");
				System.out.println(" (2) 된장찌개");
				System.out.println(" (3) 삼겹살");
				System.out.println(" (4) 비빔밥");
				System.out.print("한식 메뉴를 선택해주십시오 : ");
				
				tmp = sc.next();
				num = Integer.parseInt(tmp);
				
				switch(num){
				case 1 :
					System.out.println("김치찌개를 선택하셨습니다.");
					
					break outer;
				case 2 :
					System.out.println("된장찌개를 선택하셨습니다.");
					
					break outer;
				case 3 :
					System.out.println("삼겹살을 선택하셨습니다.");
					
					break outer;
				case 4 :
					System.out.println("비빔밥을 선택하셨습니다.");
					
					break outer;
					}
				}	
			}else if(menu == 2) {
				for(;;) {
				System.out.println(" (1) 돈까스");
				System.out.println(" (2) 비프스테이크");
				System.out.println(" (3) 카레라이스");
				System.out.print("양식 메뉴를 선택해주십시오 : ");
				
				tmp = sc.next();
				num = Integer.parseInt(tmp);
				
				switch(num){
				case 1 :
					System.out.println("돈까스를 선택하셨습니다.");
					
					break outer;
				case 2 :
					System.out.println("비프스테이크를 선택하셨습니다.");
					
					break outer;
				case 3 :
					System.out.println("카레라이스를 선택하셨습니다.");
			
					break outer;
					}
				}
			}else if(menu == 3) {
				for(;;) {
				System.out.println(" (1) 짜장면");
				System.out.println(" (2) 짬뽕");
				System.out.println(" (3) 탕수육");
				System.out.print("중식 메뉴를 선택해주십시오 : ");
				
				tmp = sc.next();
				num = Integer.parseInt(tmp);
				
				switch(num){
				case 1 :
					System.out.println("짜장면을 선택하셨습니다.");
					
					break outer;
				case 2 :
					System.out.println("짬뽕을 선택하셨습니다.");
					
					break outer;
				case 3 :
					System.out.println("탕수육을 선택하셨습니다.");
			
					break outer;
					}
				}
			}

		}System.out.println("프로그램을 모두 종류합니다. 감사합니다.");
	}
}	
