package ch07;

public class PersonUse {
	
	public static void main(String[] args) {
		
		Person obj = new Person();//객체생성(인스턴스화)
		//객체참조변수.멤버변수
		obj.setName("홍길동");
		obj.setAge(30); 
		obj.setEmail("hong@naver.com");
		obj.setAddress("서울 강남구 역삼동");
		
		obj.print();
		
		System.out.println();
		
		Person obj2 = new Person();
		obj2.setName("사임당");
		obj2.setAge(23);
		obj2.setEmail("saimdang@daum.net");
		obj2.setAddress("서울 강남구 개포동");
		
		obj2.print();
		

		
	}

}
