package ch01;

public class NameUnicode {
	
	public static void main(String[] args) {
		
		char name1 = '\uC815';
		char name2 = '\uB3D9';
		char name3 = '\uBBFC';
		
		System.out.println("=================");
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3 + "\n");
		System.out.println("-----------------");
		System.out.println("char형(\'\\uC815\')" + name1);
		System.out.println("char형(\'\\uB3D9\')" + name2);
		System.out.println("char형(\'\\uBBFC\')" + name3);
		System.out.println("=================");
		
	}

}
