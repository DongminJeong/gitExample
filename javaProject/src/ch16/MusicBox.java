package ch16;

// 메소드 앞에 synchronized를 붙이면 해당메소드는 객체의 사용권(Monitoring Lock)을 얻는다
public class MusicBox {
	public void playMusicA() {
		for(int i = 0; i < 10; i++) {
			synchronized (this) {
				System.out.println("신나는 음악!!!");
			}
			try {
				Thread.sleep((int)(Math.random()  * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void playMusicB() {
		for(int i = 0; i < 10; i++) {
			System.out.println("슬픈음악ㅜㅜㅜ");
			try {
				Thread.sleep((int)(Math.random()  * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void playMusicC() {
		for(int i = 0; i < 10; i++) {
			System.out.println("세상힙한 힙합!!!");
			try {
				Thread.sleep((int)(Math.random()  * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}