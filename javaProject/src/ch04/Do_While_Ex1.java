package ch04;

public class Do_While_Ex1 {
	
	public static void main(String[] args) {
		
		int i = 1;
		do {//먼저 실행
			System.out.print(i);
			i++;
		}while(i <= 10); // 나중에 검사, ;반드시 찍어야함
	}

}
