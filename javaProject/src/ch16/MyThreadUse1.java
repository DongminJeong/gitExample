package ch16;

public class MyThreadUse1 {
	public static void main(String[] args) {
		System.out.println("-----------------------");
		MyThreadEx1 e1 = new MyThreadEx1("스레드1**");
		MyThreadEx1 e2 = new MyThreadEx1("스레드2++");
		MyThreadEx1 e3 = new MyThreadEx1("스레드1##");
		e1.setPriority(Thread.MAX_PRIORITY);
		e3.setPriority(Thread.MIN_PRIORITY);
		e1.start();
		e2.start();
		e3.start();
	}
}
