package ch14;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EcUse {
	static void print(Map map) {
		ArrayList<EC> list = (ArrayList<EC>)map.get("list");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("-----------------------------------------------------------------");
		for(EC e : list) {
			DecimalFormat df = new DecimalFormat("###,###");
			System.out.println(e.getNo() + "\t" + e.getOrderDate() + "\t" + e.getProduct() + "\t" + e.getCardName() + "\t" + e.getCardNo().replace(e.getCardNo().substring(5, 9),"****") + "\t" + df.format(e.getPay()));
		}
		System.out.println("-----------------------------------------------------------------"); 
	}
	public static void main(String[] args) {
		ArrayList<EC> list2 = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		list2.add(new EC(1234, "2022-05-13", "티셔츠", "삼성", "37918234568", 55900));
		list2.add(new EC(2345, "2022-04-11", "컴퓨터", "롯데", "15918234568", 2555000));
		list2.add(new EC(3456, "2022-05-05", "커 피", "현대", "27918234568", 1200));
		map.put("list", list2);
		print(map);
	}
}
