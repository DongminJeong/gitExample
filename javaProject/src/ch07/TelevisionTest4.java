package ch07;

public class TelevisionTest4 {
	
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 24;
		myTv.volume = 30;
		myTv.onOff = true;
		String con;
		
		if(myTv.onOff = true) {
			con = "켜져있습니다.";
					
		}else {
			con = "꺼져있습니다.";
		}
		
		System.out.println("현재 채널은 " + myTv.channel + "이고 볼륨은" + myTv.volume + "입니다. 현제 TV가 " + con);
		
	}

}
