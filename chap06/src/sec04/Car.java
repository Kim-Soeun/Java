package sec04;

public class Car {
	private int speed = 100;
	// ������� = �Ӽ�(�ʵ�)
	
	void powerOn() {
		System.out.println("�õ��� �������ϴ�");
		
	}
	void powerOff() {
		System.out.println("�õ��� �������ϴ�");
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