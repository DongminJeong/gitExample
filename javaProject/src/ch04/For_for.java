package ch04;

public class For_for {
	
	public static void main(String[] args) {
		// 중첩 for문
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
