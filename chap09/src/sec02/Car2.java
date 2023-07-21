package sec02;


public class Car2 {
	
	// 필드값으로 익명 객체를 대입하세요
	// car 메소드 오버라이드 하고
	// speedUp(int speed) 메소드 만드세요
	
	Car car = new Car() {
		int speed;
		
		
		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("속도가 " + speed + "만큼 증가합니다");
		}
		
		@Override
		void stop() {
			System.out.println("자동차가 멈춥니다");
			speedUp(50);
		}
		
		
	};
	
	// 로컬 익명 개체 대입
	void speedDown() {
		Car downCar = new Car() {
			
			void speedReduce(int speed) {
				this.speed -= speed;
				System.out.println("속도가 " + speed + "만큼 감소했습니다");
			}
			
			@Override
			void stop() {
				System.out.println("Car가 멈춥니다");
				speedReduce(30);
			}
			
		};
		// speedDown() 메소드를 호출하면 익명 개체안의
		// 메소드가 자동으로 실행되지 않음
		// 그래서 아래 코드 필요함
		downCar.stop();
		
	}
	
}
