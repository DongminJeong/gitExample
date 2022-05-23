package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str = "kim,20,180,55,서울,학생";//컴마, tap, /을 주어서 데이터를 구분
		String[] items = str.split(",");
		for(String s : items) {
			System.out.println(s);
		}
		
		StringTokenizer st = new StringTokenizer(str, ",");
		int cnt = st.countTokens(); //토크느이 갯수를 리턴
		System.out.println("토큰의 갯수 : " + cnt);
		
		while(st.hasMoreElements()) {//다음 요소의 내용이 있으면
			System.out.println(st.nextToken());
		}
	}
}
