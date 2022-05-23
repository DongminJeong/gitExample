package ch10;

class Test11{
	//오버라이딩은 메소드의 header가 동일해야 함.
	
	public void print() {
		
	}
}

class Test22 extends Test11 {
	
	public void print() {
		
		System.out.println("test22");
	}
}

public class OverrideEx {
	
	public static void main(String[] args) {
		
		Test22 t = new Test22();
		
		t.print();
		
	}

}
