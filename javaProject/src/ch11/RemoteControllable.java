package ch11;

public interface RemoteControllable extends Controllable {
	//인터페이스끼리는 extends로 상속가능
	void remoteOn();
	void remoteOff();
}
