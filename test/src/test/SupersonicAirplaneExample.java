package test;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.fly();		// �ڽ� �޼ҵ�(�������̵�)
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();		// �θ� �޼ҵ�
		
	}

}
