package sec01.exam01;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Truck();
		
		car.speedDown(30);
		car.speedUp(300);
		
		// ���� Car�� ������ SportCar Ŭ������ �ִٸ�
		// car = new SportCar(); �� �̿��Ͽ�
		// car �������̽� �ϳ��� �� ��ü�� ���� ���� ������
		
		car = new SportCar();
		car.speedUp(50);
		car.speedDown(20);
	}

}