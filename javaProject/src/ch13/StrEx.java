package ch13;

public class StrEx {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		//대문자로 변경
		System.out.println(str.toUpperCase());
		//소문자로 변경
		System.out.println(str.toLowerCase());
		System.out.println(str); //불변성(원본은 바뀌지 않음)
		
		str = str.toLowerCase();//기존 str 주소값은 끊어지고 소문자 처리된 문자열로 새로 연결
		System.out.println(str);
		
		str = ""; //널문자 ('\0')을 가리킴
		System.out.println("내용 : " + str);
		str = null; //서로다름 얘는 주소값이 없음(참조하는 내용이 없다)
		System.out.println("내용 : " + str);
		
		char ch = '\0';//널문자
		System.out.println("내용 : " + ch + ",cod:" + (int)ch);//""와 같음
		ch = ' ';
		System.out.println("내용 : " + ch + ",cod:" + (int)ch);//""와 같음
	}

}
