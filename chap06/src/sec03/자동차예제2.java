package sec03;

public class �ڵ�������2 {

	public static void main(String[] args) {

		Car car2 = new Car("BMW", 250); 	// ����� ���� ������ ȣ��
		System.out.println("�𵨸� : " + car2.model);
		System.out.println("�ӵ� : " + car2.speed);
		System.out.println("����ȸ�� : " + car2.company);
		
		Car car3 = new Car("�׽���3", "������", 350);
		System.out.println("�𵨸� : " + car3.model);
		System.out.println("���� : " + car3.color);
		System.out.println("�ӵ� : " + car3.maxSpeed);
		
	}

}
