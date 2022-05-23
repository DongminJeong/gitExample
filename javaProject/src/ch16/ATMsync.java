package ch16;

public class ATMsync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "mom");
		Thread son = new Thread(atm, "son");
		mom.start();
		son.start();
	}
}

class ATM implements Runnable {
	private long depositeMoney = 10000;
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 10; i++) {
				notify();//일시정지상태에 있는 스레드를 깨움. wait하고 있는 스레드 한개에 신호를 보냄. 여러 스레드에서 wait하고 있어도 한 개만 깨움.
//				어떤 스레드를 깨울지는 알 수 없다. notifyAll() : wait하고 있는 모든 스레드를 깨움 순서는 랜덤
				try {
					wait();
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(getDepositeMoney() <= 0) {//잔액이 0원 이하면 
					break;
				}
				withDraw(1000);
			}
		}
	}
	private void withDraw(long howMuch) {
		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName());
			System.out.printf("잔액 : %,d 원 %n", getDepositeMoney());
		}else {
			System.out.print(Thread.currentThread().getName());
			System.out.println("잔액이 부족합니다.");
		}
	}
	public long getDepositeMoney() {
		return depositeMoney;
	}
}
