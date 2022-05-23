package ch14;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Product2 {
	private String num;
	private String name;
	private String comp;
	private int date;
	private int uPrice;
	private int amount;
	private double price;
	String exit;
	public Product2() {
	}
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품번호 : ");
		num = sc.next();
		System.out.print("제품명 : ");
		name = sc.next();
		System.out.print("제조사 : ");
		comp = sc.next();
		System.out.print("제조일자 : ");
		date = sc.nextInt();
		System.out.print("단가(천원) : ");
		uPrice = sc.nextInt();
		System.out.print("수량 : ");
		amount = sc.nextInt();
		sc.close();
	}
	public void outPut() {
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(getNum() + "\t" + getName() + "\t" + getComp() + "\t" + getDate() + "\t" + df.format(getuPrice()) + "\t\t" + getAmount() + "\t" + df.format(getPrice()));
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getuPrice() {
		return uPrice;
	}
	public void setuPrice(int uPrice) {
		this.uPrice = uPrice;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		price = (uPrice * amount) * (1.1);
		return Math.round(price);
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
