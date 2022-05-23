package ch07;

public class BookStoreUse {
	
	public static void main(String[] args) {
		
		BookStore b1 = new BookStore();
		
		b1.setName("Java");
		b1.setWriter("김선생");
		b1.setPublisher("영진");
		b1.setYear(2022);
		b1.setSell(30000);
		b1.setWorkable(10);
		b1.setPrice(300000);
		
		b1.print();
		
	}

}
