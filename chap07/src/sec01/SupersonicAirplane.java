package sec01;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	// ���� ��� 2�� ����, ��� �̸��� ���ʰ� �빮��

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("�ʼӺ����մϴ�");
		} else {
			super.fly();
		}
	}

}
