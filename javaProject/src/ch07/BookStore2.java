package ch07;

public class BookStore2 {
	
	String name;
	String writer;
	String publisher;
	int year;
	int price;
	int workable;
	int sell;
	
	public void input(String name, String writer, String publisher, int year, int price, int workable, int sell) {
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
		this.year = year;
		this.price = price;
		this.workable = workable;
		this.sell = sell;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(name + "\t" + writer + "\t" + publisher + "\t" + year + "\t" + price + "\t" + workable + "\t" + sell);
	}

}
