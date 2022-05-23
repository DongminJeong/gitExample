package ch10;

class A2{
	//만약에 부모클래스에서 멤버메스드중에 final이 붙으면 오버라이드가 안된다.
	//final void print() {
	void print() { // non-static
		System.out.println("a");
	}
}

class B2 extends A2{
	void print() { //메소드 오버라이딩(제정의), non-static
		super.print();
		System.out.println("b");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		B2 b = new B2();
		b.print();
		
	}
}
