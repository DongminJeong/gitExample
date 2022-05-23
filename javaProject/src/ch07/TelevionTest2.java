package ch07;

public class TelevionTest2 {
	
	public static void main(String[] args) {
		
		Television myTv = new Television();
		System.out.println(myTv);
		myTv.channel = 9;
		myTv.volume = 20;
		myTv.onOff = true;
		System.out.println("나의 TV 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");
		
		Television yourTv = new Television(); //객체 생성
		System.out.println(yourTv);
		yourTv.channel = 11;
		yourTv.volume = 15;
		yourTv.onOff = false;
		System.out.println("너의 TV채널은 " + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");
	}

}
