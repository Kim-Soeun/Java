package sec01;

public class Car {		// �ν��Ͻ� ��� Ŭ����

	String company;
	int speed;
	int cost;
	String color;
	
	Car() {		// �⺻ ������
		
	}
	
	Car (String company, int cost) {	// �Ű����� 2�� ������
		this.company = company;
		this.cost = cost;
	}
	
	void speedUp (int speed) {	// �Ű����� 1��, ���� x �޼ҵ�
		this.speed += speed;
	}
	
	void OldSpeed() {					// Car Ŭ���� ���ο����� OldCar ��ü �ٷ� ���� ������
		OldCar oldcar = new OldCar();	// OldCar�� Car Ŭ���� ���ο� �ֱ� ���� 
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
	   Car car = new Car("����", 3000000);
	// car.speedUp(50);
	// car.OldSpeed();
	   Car.OldCar old = car.new OldCar();
   }
	
}
