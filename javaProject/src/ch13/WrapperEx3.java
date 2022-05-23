package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		String s = new String("Hello 1234");
		char [] ary = new char[s.length()];
		System.out.println("-----------------------------");
		for(int i = 0; i < s.length(); i++) {
			ary[i] = s.charAt(i);
		}
		for(int i = 0; i < ary.length; i++) {
			if(Character.isUpperCase(ary[i])) {//대문자면 true를 리턴
				System.out.println(ary[i] + "는 대문자입니다.");
			}else if(Character.isLowerCase(ary[i])) {//소문자면 true
				System.out.println(ary[i] + "는 소문자입니다.");
			}else if(Character.isDigit(ary[i])) {//숫자면 true
				System.out.println(ary[i] + "는 숫자입니다");
			}
		}
		System.out.println("-----------------------------");
		String s2 = s.substring(6);
		System.out.println("문자 " + s2 +"입니다.");
		System.out.println("숫자 " + Integer.parseInt(s2) + "입니다.");
		System.out.println("숫자 " + Integer.parseInt(s2) +" + 2 = " + (Integer.parseInt(s2) + 2) + " 입니다");
	}
}
