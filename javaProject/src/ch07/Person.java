package ch07;

public class Person {
	
	private String name;
	private int age;
	private double height;
	private String email;
	private String address;
	
	void setEmail(String email) {
		this.email = email;
	}
	String getEmail() {
		return email;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	String getAddress() {
		return address;
	}
	
	//setter : set+변수명
	public void setName(String name) {
		//this => 멤버변수를 가리킴
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			System.out.println("입력값이 정확하지 않음.");
		}else {
			this.age = age;
	}
	}
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("이메일 : " + email);
		System.out.println("주소 : " +  address);
	}

}
