package ch10;

public class OverloadEx {
	//overload : method이름은 같고  매개변수갯수나 자료형이 다른 것.
	
	public void putData(String a) {
		
		System.out.println(a);
		
	}

	public void putData(int a) {
		
		System.out.println(a);
		
	}

	public void putData(double a) {
	
	System.out.println(a);
	
	}
	
	public static void main(String[] args) {
	
		OverloadEx o = new OverloadEx();
		
		o.putData("hello");
		o.putData(21);
	}
}
