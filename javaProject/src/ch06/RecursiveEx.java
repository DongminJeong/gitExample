package ch06;

public class RecursiveEx {
	
	public static void main(String[] args) {
		
		System.out.println(fact1(30)); // 5! = 5 x 4 x 3 x 2 x 1
	}
	
	static long fact1(int n) {
		return n==1 ? 1 : n * fact1(n - 1);
	}
	//큰수를 다룰때는 BigInteger를 사용하거나 배열 사용

}
