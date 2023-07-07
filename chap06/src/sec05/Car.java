package sec05;

public class Car {

	//필드 선언
	String model;
	int speed;
	
	// 기본 생성자
	Car() {
		
	}
	
	// 매개변수 1개 생성자, 기본 생성자는 안 만들어짐
	Car(String model) {
		this.model=model;	
	}
	
	// 매개변수 1개 메소드, 리턴값 없음
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//매개변수 없는 메소드, 리턴값 없음
	// 10부터 50까지 5번 반복해서 속도를 대입하고 출력
	void run() {
		for(int i = 0; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h");
		}
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		myCar.run();
		
		// speed = 60;  x
		Car yourCar = new Car();
		yourCar.speed = 60;
	}
}
