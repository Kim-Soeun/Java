package sec01;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.fly();		// 부모 메소드 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();		// 자식 메소드 호출
		
		
	}

}
