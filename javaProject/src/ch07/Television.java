package ch07;

public class Television {
	
	//멤버 변수(전역변수)
	int channel;//채널번호
	int volume;//음크기
	boolean onOff;//전원상태
	
	
	void print() {
		System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
	}
	
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch; // 멤버변수 = 로컬변수
	}

}
