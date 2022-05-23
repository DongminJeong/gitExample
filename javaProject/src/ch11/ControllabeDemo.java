package ch11;

public class ControllabeDemo {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		Controllable.reset();
		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		Controllable.reset();
	}

}
