package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product2> list = new ArrayList<>();
		System.out.println("제품정보를 입력하세요.");
		while(true) {
			Product2 p = new Product2();
			System.out.print("종료를 원하시면 exit, 진행을 원하시면 아무 문자나 입력해주세요 : ");
			p.exit = sc.next();
			if(p.exit.equals("exit")) {
				break;
			}
			p.inPut();
			list.add(p);
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("제품번호\t제품명\t제조사\t제조일자\t\t단가(천원)\t수량\t금액");
		System.out.println("-----------------------------------------------------------------------");
		for (Product2 p1 : list) {
			p1.outPut();
		}
		System.out.println("------------------------------------------------------------------------");
		sc.close();
	}
}

