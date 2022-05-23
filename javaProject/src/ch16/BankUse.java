package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank ac = new MyBank();
		BankPlayer Hong = new BankPlayer("홍길동", 10, ac);
		BankPlayer Shin = new BankPlayer("사임당", 20, ac);
		BankPlayer Lee = new BankPlayer("이몽룡", 30, ac);
		Hong.start();
		Shin.start();
		Lee.start();
	}
}
