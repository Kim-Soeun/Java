package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {

		Truck truck = new Truck("���", "����", 3, "��");
		
		Car car = truck;		// Ŭ���� �ڵ� Ÿ�� ��ȯ
		
		car.speedUp(30);		// �θ� �޼ҵ� ȣ��
//		car.maxSpeed(50);		// Ÿ���� ��ȯ�Ǿ��� ������ �ڽ� �޼ҵ� ȣ�� x
		
		car.start();			//�ڽ� �޼ҵ������� �������̵� �߱� ������ ȣ�� ����
		
	}

}
