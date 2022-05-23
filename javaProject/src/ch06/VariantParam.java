package ch06;

public class VariantParam {

	//자료형...변수 -> 가변사이즈 매개변수, 변수가 배열참조 변수가 됨
	//매개변수들이 배열로 저장됨
	static void print(String...n) {
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
	}
	
	public static void main(String[] args) {
		print("java");
		print("java", "program");
		print("java", "program", "jsp");
		print("java", "program", "jap", "spring");
	}
}
