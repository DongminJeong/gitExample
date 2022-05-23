package ch16;

public class MyBank {
	public synchronized void account(String name, int ac) {
		for(int i = 0; i < 5; i ++) {
			System.out.println(name + "님의 통장잔고는 " + ac +" 만원입니다.");
			ac += 10;
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//end for
	}
}
