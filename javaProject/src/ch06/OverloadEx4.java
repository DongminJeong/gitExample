package ch06;

public class OverloadEx4 {
	
	public static void main(String[] args) {
		print("홍길동", 3000);
		
	}
	static void print(String name, int pay) {
		
		System.out.println("======================================");
		System.out.println("이름\t급여\t세금\t실수령액");
		double tax = pay * 0.03;
		double netpay = pay - tax;
		
		System.out.println(name + "\t" + pay + "\t" + tax + "\t" + netpay);
	}

}
