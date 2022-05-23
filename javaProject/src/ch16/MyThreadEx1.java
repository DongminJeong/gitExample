package ch16;

public class MyThreadEx1 extends Thread{
	public MyThreadEx1(String name) {
		super(name);
	}
	public MyThreadEx1() {
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
