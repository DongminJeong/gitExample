package ch11;

public class AutoCar implements OperateCar {

	@Override
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 속도를");
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를" + speed + "높입니다.");
	}

	@Override
	public void turn(int degree) {
		System.out.println("자동차가 정지합니다.");

	}

}
