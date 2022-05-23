package ch12;

interface RemoteControl {
	//추상메소드(구현부가 없는 메소드)
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		//interface는 new해서 객체생성 못함
		//무명클래스 처리하면 자동적으로 인터페이스를 무명클래스가 상속
	RemoteControl ac = new RemoteControl() {
		
		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			
		}
	};//무명내부클래스
	
	}
}
