package ch09;

public class Employee {
	
	public String name;
	String address; // 주소 default
	protected int salary; // 월급
	private String rrn; // 주민등록번호
	
	public String getRrn() {
		return rrn;
	}
	
	public Employee() {
		
	}

	public Employee(String name, String address, int salary, String rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}

	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	

}
