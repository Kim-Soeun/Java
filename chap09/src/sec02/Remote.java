package sec02;

public class Remote {

	// 익명 구현 객체 생성
	RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
		
	};

	// 메소드 내부 로컬 변수로 익명 구현 객체 사용
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다");
			}
			
		};
		// 익명 구현 객체 내부 메소드는 
		// 외부 메소드에서 반드시 호출해줘야 함
		localVar.turnOn();
		localVar.turnOff();
	}
	
	// 매개변수로 익명 구현 객체를 사용하는 메소드
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}
