package sec02;

public class RemoteMain {

	public static void main(String[] args) {

		Remote rm = new Remote();
		rm.rc.turnOn();
		rm.method1();
		
		// 매개변수로 익명 구현 객체 사용
		rm.method2(
				new RemoteControl() {

					@Override
					public void turnOn() {
						System.out.println("스마트 TV를 켭니다");
					}

					@Override
					public void turnOff() {
						System.out.println("스마트 TV를 끕니다");
					}
					
				}
				
			);
		
	}

}
