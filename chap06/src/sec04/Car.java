package sec04;

public class Car {
	private int speed = 100;
	// 멤버변수 = 속성(필드)
	
	void powerOn() {
		System.out.println("시동이 켜졌습니다");
		
	}
	void powerOff() {
		System.out.println("시동이 꺼졌습니다");
	}
	
	int speedUp(int x) {
		speed += x;
		return speed;
	}
	
	int speedDown(int x) {
		speed -= x;
		return speed;
	}
	
	int breakZero() {
		speed = 0;
		return speed;
	}
}
