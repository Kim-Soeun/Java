package sec02.exam01;


public class Car {
		// 멤버변수(필드)
		String color;
		String company;
		int speed=10;
		int cost;

		// 매개변수 2개 생성자, 기본 생성자 x
		public Car(String color, String company) {
			this.color = color;
			this.company = company;
		}

		// 매개변수 int 1개인 메소드, 리턴타입 x, 매개변수 숫자만큼 스피드 증가
		void speedUp(int speed) {
			this.speed += speed;
			System.out.println(this.speed);
		}
		
		// 매개변수 int 1개인 메소드
		// 리턴타입 x, 매개변수의 숫자만큼 스피드 감소
		void speedDown(int speed) {
			this.speed -= speed;
			System.out.println(this.speed);
		}
		
		// 매개변수 x, 리턴타입 x
		void start() {
			System.out.println("시동을 걸었습니다");
		}
		
		// 매개변수 x, 리턴타입 x
		void stop() {
			System.out.println("차를 멈춥니다");
		}
		
}
