package test;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("�ʼӺ����մϴ�");
		} else {
			super.fly();
		}

	}
}