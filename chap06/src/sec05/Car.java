package sec05;

public class Car {

	//�ʵ� ����
	String model;
	int speed;
	
	// �⺻ ������
	Car() {
		
	}
	
	// �Ű����� 1�� ������, �⺻ �����ڴ� �� �������
	Car(String model) {
		this.model=model;	
	}
	
	// �Ű����� 1�� �޼ҵ�, ���ϰ� ����
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//�Ű����� ���� �޼ҵ�, ���ϰ� ����
	// 10���� 50���� 5�� �ݺ��ؼ� �ӵ��� �����ϰ� ���
	void run() {
		for(int i = 0; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�: " + this.speed + "km/h");
		}
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("������");
		myCar.run();
		
		// speed = 60;  x
		Car yourCar = new Car();
		yourCar.speed = 60;
	}
}