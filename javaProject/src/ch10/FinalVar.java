package ch10;

//final 변수
//1)값을 변경할 수 없음
//2)초기값이 반드시 필요함
//3)대문자로 작성, 2단어 이상일 경우 _로 연결

public class FinalVar {
	
	final static int MAX_NUM = 500; //변수에 final을 붙이면 값을 변경할 수 없다.
//	final static int MAX_NUM = 500; //final변수는 전역변수화해도 선언만하면 에러
	
	
	public static void main(String[] args) {
		
		int max = 100;
		System.out.println(max);
		
		System.out.println(MAX_NUM);
//		MAX_NUM = 200; //final 변수(상수)는 값을 수정할 수 없음.
	}

}
