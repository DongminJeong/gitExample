package ch07;

public class RadioTest {
	
	public static void main(String[] args) {
		
		Radio obj = new Radio();
		obj.model = "브리츠";
		obj.channel = 89.1;
		obj.volume = 12;
		obj.onOff = "켜져";
		
		
		
		obj.print();
		
		Radio obj2 = new Radio();
		obj2.model = "아이리버";
		obj2.channel = 95.1;
		obj2.volume = 9;
		obj2.onOff = "꺼져";
		
		obj2.print();
		
	}
	
	

}
