package ch10;

class T {
	
	private int num = 10;
	
	public void print() { //메소드에 final을 쓰면 오버라이딩이 안된다.
		
		System.out.println(num);
	}
}

public class FinalMehod2 extends T {
	
	int num = 100;
	
	public void print() { //부모쪽 오버라이딩되는 메소드가 final일때는 에러
		
		System.out.println(num);
		
	}

}
