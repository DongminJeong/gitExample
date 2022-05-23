package ch09;

public class SportsCar extends Car{ //부모객체인 Car를 상속받음
	
	boolean turbo; // SportsCar의 멤버 변수
	
	public void setTurbo(boolean flag) {
		turbo = flag;
		System.out.println(turbo);
	}

}
