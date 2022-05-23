package ch13;

public class ObjectEx  extends Object {
	public static void main(String[] args) {
		ObjectEx e1 = new ObjectEx();
		System.out.println(e1.getClass());//클래스의 정보
		System.out.println(e1);
		System.out.println(e1.toString());//object를 문자열로 변환하여 표시
	}

}
