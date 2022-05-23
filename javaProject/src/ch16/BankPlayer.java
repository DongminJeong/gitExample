package ch16;

public class BankPlayer extends Thread{
	String name;
	int ac;
	MyBank mybank;
	public BankPlayer(String name, int ac, MyBank mybank) {
		this.name = name;
		this.ac = ac;
		this.mybank = mybank;
	}
	public BankPlayer() {
	}
	public void run() {
		mybank.account(name, ac);
	}
}
