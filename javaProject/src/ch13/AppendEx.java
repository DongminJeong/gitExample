package ch13;

public class AppendEx {
	public static void main(String[] args) {
		//실제 쓰임새는 짧은 문자열을 처리할 때
		String a = "hello";//불변성
		a = a + "java";
		System.out.println(a);
		
		//가변성(mutable)
		//실제 쓰임새는 긴문자열을 처리하고자 할 때
		StringBuilder b = new StringBuilder();
		b.append("java");
		System.out.println(b);
	}

}
