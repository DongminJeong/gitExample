package ch10;

//static -> 메모리의 특정한 static 영역을 사용(객체 생성과는 별개로 무조건 자동적으로 메모리 로딩)
//non-static -> 객체 생성된 후에 로딩 
//static method에서는 static 안의 로컬 변수(일반변수)나 static으로 정의된 멤버 변수만 사용가능

public class A {
	//non-static 멤버 변수
	String name = "kim";
	//static 멤버변수
	static int n = 20;
	//non-static 멤버메소드
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	//static 멤버 메소드
	public static void main(String[] args) {
		//non-static 멤버변수
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);//static은 static 멤버 끼리 통한다.
		
		A a1 = new A(); //객체를 생성한 후에나 non-static멤버들을 사용할 수 있음
		System.out.println(a1.name); //참조변수.non-static멤버변수
//		System.out.println(name); //non-static 멤버변수는 static 메소드안에서는 바로 쓸 수 있다.
		
		a1.print();
	}
}
