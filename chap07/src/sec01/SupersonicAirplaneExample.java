package sec01;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.fly();		// �θ� �޼ҵ� ȣ��
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();		// �ڽ� �޼ҵ� ȣ��
		
		
	}

}
