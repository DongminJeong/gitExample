package ch16;

public class MyThread1 extends Thread{
	String str;
	public MyThread1(String str) {
		this.str = str;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.print(str);
			try {
				Thread.sleep((int)(Math.random() * 5000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
