package ch12;

public class TestOuter {
	private int data = 30;
	class Inner{
		void msg() {
			System.out.println("data is " + data);
			//내부클래스는 외부클래스의 멤버를 자유롭게 사용 가능
		}
	}//end inner class

	public static void main(String[] args) {
		TestOuter obj = new TestOuter();
		TestOuter.Inner in = obj.new Inner(); //내부클래스 객체 생성
		in.msg();
	}
}
