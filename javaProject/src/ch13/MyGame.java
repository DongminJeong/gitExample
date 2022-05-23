package ch13;

import java.util.Random;
import java.util.Scanner;

public class MyGame {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] rs = {"가위", "바위", "보"};
		
		
		while(true) {
			int com = (int)(Math.random() * 3);
			System.out.print("가위, 바위, 보 중 하나를 입력하세요 : ");
			String inp = sc.next();
			System.out.println("");
			if(inp.equals("exit")) {
				break;
			}
			if(inp.equals("가위")) {
				if(com == 0) {
					System.out.println("지셨습니다. 컴퓨터는 바위입니다.");
					continue;
				}else if(com == 1) {
					System.out.println("이겼습니다. 컴퓨터는 보입니다.");
					continue;
				}else if(com == 2){
					System.out.println("비겼습니다. 컴퓨터는 가위입니다.");
					continue;
				}
			}else if(inp.equals("바위")) {
				if(com == 0) {
					System.out.println("비겼습니다. 컴퓨터는 바위입니다.");
					continue;
				}else if(com == 1) {
					System.out.println("지셨습니다. 컴퓨터는 보입니다.");
					continue;
				}else if(com == 2){
					System.out.println("이겼습니다. 컴퓨터는 가위입니다.");
					continue;
				}
			}else if(inp.equals("보")) {
				if(com == 0) {
					System.out.println("이겼습니다. 컴퓨터는 바위입니다.");
					continue;
				}else if(com == 1) {
					System.out.println("비겼습니다. 컴퓨터는 보입니다.");
					continue;
				}else if(com == 2){
					System.out.println("지셨습니다. 컴퓨터는 가위입니다.");
					continue;
				}
			}
		}
		System.out.println("Game Exit...");
	}
}
	
		
		
