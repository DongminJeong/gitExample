package ch10;

public class StaticMethod {
	
	static int a = 10; // static 멤버
	int b = 20; // non-static 멤버
	
	public static void printA() {//static 멤버메소드
		System.out.println(a);
//		System.out.println(b); // static 멤버ㅂ메소드 안에서는 non-static 멤버변수를 쓸 수 없다.
		StaticMethod s = new StaticMethod();
		System.out.println(s.b);//non-static 멤버는 반드시 new를 통해 인스턴스화 후 접근 가능
		
	}
	
	public void printB() {//non-static 멤버 메소드
		System.out.println(a); // static
		System.out.println(b); // non static
		
	}
	
	public static void main(String[] args) {
		printA();
		//printB();
	}

}
