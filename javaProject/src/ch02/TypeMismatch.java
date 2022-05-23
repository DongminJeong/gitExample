package ch02;

public class TypeMismatch {
	
	public static void main(String[] args) {
		
		byte n;
		
			n = 127; // n = 300 안됨, byte타입의 값은 -128~127
			
				System.out.println(n);
	}

}
