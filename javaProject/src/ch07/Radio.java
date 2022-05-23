package ch07;

public class Radio {
	
	String model;
	double channel;
	int volume;
	String onOff;
	
	
	void print() {
		System.out.println(model + " 라디오가 " + onOff + " 있습니다. 현재 채널은 " + channel + "입니다. 볼륨은 " + volume + "입니다.");
	}

}
