package ch13;

public class WrapDouble {
	public static void main(String[] args) {
		Double num1 = new Double("11.5");
//		Double num1 = new Double(11.5);
		double num2 = 3.5; // 기본자료형
		double num3 = num1 / num2; //auto unboxing
		System.out.println(num3);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		String str = "11.5";
		System.out.println(str + 200); //문자열 이어서
		System.out.println(Double.parseDouble(str) + 200);//parseDouble 실수로 변환에서 계산
	}
}
