package sec01;

public class Car3 {

	String company;
	int speed;
	int cost;
	String color;
	
	Car3() {		// �⺻ ������
		
	}
	
	Car3 (String company, int cost) {	// �Ű����� 2�� ������
		this.company = company;
		this.cost = cost;
	}
	
	void speedUp (int speed) {	// �Ű����� 1��, ���� x �޼ҵ�
		this.speed += speed;
	}
	
	void OldSpeed() {					// Car Ŭ���� ���ο����� OldCar ��ü �ٷ� ���� ������
		OldCar2 oldcar = new OldCar2();	// OldCar�� Car Ŭ���� ���ο� �ֱ� ���� 
		oldcar.speed = 50;
	}
	
	
	
	
	
	public static class OldCar2 {
		int speed;
		int cost;
		
		void speedUp(int speed) {
			this.speed += speed;
		}
	}
	
	
   class Car4 {
	  // ���� Ŭ������ ���� Ŭ������ ��ü �������� �ʰ�
	  // �ٷ� ��ü ���� ������
	  Car3.OldCar2 old = new Car3.OldCar2(); 
   }
	
}
