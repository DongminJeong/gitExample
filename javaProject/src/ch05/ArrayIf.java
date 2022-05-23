package ch05;

public class ArrayIf {
	
	public static void main(String[] args) {
		
		int[] ary = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		if(ary != null) { // ary가 주소값이 있으면, null은 주소값이 없는 것
			for(int i = 0; i< 10; i++) {
				System.out.print(ary[i] + ",");
			}
			
		}
	}

}
