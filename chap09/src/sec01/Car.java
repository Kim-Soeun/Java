package sec01;

public class Car {		// 인스턴스 멤버 클래스

	String company;
	int speed;
	int cost;
	String color;
	
	Car() {		// 기본 생성자
		
	}
	
	Car (String company, int cost) {	// 매개변수 2개 생성자
		this.company = company;
		this.cost = cost;
	}
	
	void speedUp (int speed) {	// 매개변수 1개, 리턴 x 메소드
		this.speed += speed;
	}
	
	void OldSpeed() {					// Car 클래스 내부에서는 OldCar 객체 바로 생성 가능함
		OldCar oldcar = new OldCar();	// OldCar가 Car 클래스 내부에 있기 때문 
		oldcar.speed = 50;
	}
	
	
	
	
	class OldCar {
		int speed;
		int cost;
		
		void speedUp(int speed) {
			this.speed += speed;
		}
	}
	
	
   class Car2 {
	   Car car = new Car("현대", 3000000);
	// car.speedUp(50);
	// car.OldSpeed();
	   Car.OldCar old = car.new OldCar();
   }
	
}
