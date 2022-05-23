package ch14;

public class Product {
	private String name;
	private String company;
	private int date;
	private int uPrice;
	private int amount;
	private int price;
	public Product() {
	}
	
	public Product(String name, String company, int date, int uPrice, int amount) {
		super();
		this.name = name;
		this.company = company;
		this.date = date;
		this.uPrice = uPrice;
		this.amount = amount;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getuPrice() {
		return uPrice;
	}
	public void setuPrice(int uPrice) {
		this.uPrice = uPrice;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return uPrice * amount;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
