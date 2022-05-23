package ch12;

public class LocalOuter {
	private int data = 30;
	void display() {
		class LocalInner{
			void msg() {
				System.out.println(data);
			}
		}//end inner class
		LocalInner li = new LocalInner();//내부객체생성
		//지역내부클래스는 바드시 해당 메소드안에서 객체생성을 해야 한다/
		li.msg();
	}//end method
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
	}

}
