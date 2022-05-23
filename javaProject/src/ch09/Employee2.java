package ch09;

public class Employee2 {
	
	int num;
	String name;
	String address;
	String email;
	int pay;
	private String rrn;
	int bonus;

	
	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public Employee2() {
		
	}
	
	public Employee2(int num, String name, String address, String email, int pay, String rrn, int bonus) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.pay = pay;
		this.rrn = rrn;
		this.bonus = bonus;
		
	}
}

	
