package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming"; // str1 = str1 + "programming", 문자열 연결이지만 실제로는 새로운 문자열을 만들고 str1 은 새로운 문자열의 주소값을 가리키게됨.
		System.out.println(str1);
		System.out.println(str1.length());//문자열의 길이
		String str2 = str1.concat(" programming");//concat()으로 문자열을 연결
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));//charAt(n) n번째 문자열을 리턴 배열이기 때문에 0번부터 시작
		System.out.println(str2.indexOf("program"));//찾고자 하는 문자열의 시작문자열의 인덱스값을 리턴
		System.out.println(str2.indexOf("z"));//내용이 없으면 -1을 리턴
		
		System.out.println(str2.substring(0, 4));//substring(start, end-1) => (0 ~ 3)호출
		System.out.println(str2.substring(5));//substring(n ~ end) n번부터 끝까지
		
		System.out.println(str2.replace("java", "jsp")); //문자열.replace(old, new) 바꿈
		String str3 = "351231231414";
		System.out.println(str3.substring(5, 9));
		System.out.println(str3.replace(str3.substring(5, 9), "******"));
		//replace(old(substring(5, 9-1)), new)
	}
}
