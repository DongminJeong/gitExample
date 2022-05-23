package ch16;

public class MyThreadEx2 implements Runnable{
	String str;
	public MyThreadEx2() {
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(str);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public MyThreadEx2(String str) {
		this.str = str;
	}
}
