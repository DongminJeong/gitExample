package ch04;

public class OddEx_EvenEx {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				a += i;
				}
			}
		System.out.println("1~10까지 홀수의 합은 " + a);
		
		for(int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				b += i;
				}
			}
		System.out.println("1~10까지의 짝수의 합은 " + b);
	}

}
