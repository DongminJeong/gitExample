package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	public static void main(String[] args) {
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
		//Buffered계열(Reader계열(Stream))) 형태로 구성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 한줄을 입력하세요 : ");
		try {
			String str=reader.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("[프로그램 종료]");
	}
}
