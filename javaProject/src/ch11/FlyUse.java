package ch11;

public class FlyUse {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		//두번째 : 다형성기법
		//좌변 : 부모, 우변 : 자식 => 다형성
		Flyer f = new Bird();
		System.out.println(f);
		f.takeOff(); // f3을 누르면 해당되는 부모 Flyer의 메소드가 나옴:)
		f.fly();
		f.land();
		
		f = new Airplane();
		System.out.println(f);
		f.takeOff();
		f.fly();
		f.land();
	}
}
