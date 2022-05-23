package ch07;

class Phone{
	
	String model;
	//멤버 변수
	int value;
	
	//멤버 메소드
	void print() {
		System.out.println(value + "만원 짜리" + model + "스마트폰");
	}
}

public class PhoneDemo {
	
	public static void main(String[] args) {
		
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 S22울트라";
		myPhone.value = 145;
		myPhone.print();
		
		Phone yourPhone = new Phone();
	yourPhone.model = "아이폰";
	yourPhone.value = 135;
	yourPhone.print();
	}
}
