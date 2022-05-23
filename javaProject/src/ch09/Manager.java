package ch09;

public class Manager extends Employee{
	
	private int bonus;
	
	public Manager(String name, String address, int salary, String rrn, int bonus) {
		
		super(name, address, salary, rrn);
	}

	public Manager() {
		
	}
	
	void test() {
		System.out.println("name = " + name);
		System.out.println("address" + address);
		System.out.println("주민번호 : " + getRrn());
		System.out.println("salary = " + salary);
		System.out.println("bonus = " + bonus);
	}
}
