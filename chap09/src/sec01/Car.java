package sec01;

public class Car { // 인스턴스 멤버 클래스

	String company;
	int speed;
	int cost;
	static String color;

	Car() { 		// 기본 생성자
		System.out.println("Car 호출");
	}

	
	
	class OldCar { // 중첩 클래스(인스턴스 멤버 클래스)

		int speed;
		int cost;

		OldCar() {
			System.out.println("OldCar 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;

		}
		
		void carCall() {
		// 인스턴스 내부 클래스의 메소드에서
		// 바깥 클래스의 필드와 메소드 접근 가능함 
		// 인스턴스 클래스에서는 모든 필드와 메소드 접근 가능
			company="현대";
			stop();		// 인스턴스 메소드 접근 가능
			stop2();	// 정적 메소드 접근 가능
		}
	}

	
	
	static class Truck {  	// 중첩 클래스(정적 멤버 클래스)
		int cost;			// 필드에 static 써도 되고 안써도 됨
		static int speed;

		Truck() {
			System.out.println("Truck 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}
		
		void carCall() {
			// 정적 클래스의 메소드에서
			// 바깥 클래스의 인스턴스 필드, 메소드 접근 x
			// 바깥 클래스의 정적 필드, 메소드 접근 o
			//	company="현대";
			//	stop();
			color = "빨강";
			stop2();		// 둘다 static 이라 접근 가능
			}

	}

	
	
	void speedUp(int speed) {
		this.speed += speed;
	}

	void stop() {
		System.out.println("Car 멈춤");
	}
	
	static void stop2() {
		System.out.println("Car2 멈춤");
	}
	
}
