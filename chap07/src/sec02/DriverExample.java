package sec02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver(); //Driver Ŭ���� ��ü ����
		Bus bus = new Bus();		  // Bus Ŭ���� ��ü ����
		Taxi taxi = new Taxi();		  // Taxi Ŭ���� ��ü ����
		
		bus.run();
		
//		driver.drive();            //drive �޼ҵ�� �Ű������� �־�� ��
		driver.drive(bus);		   // Ŭ���� Ÿ���� �Ű����� �߰���
		// �ڵ� Ÿ�� ��ȯ : Vehicle vehicle = bus;
		// bus�� ���� �Ű����� �ڸ��� ���� Vehicle vehicle Ŭ���� Ÿ���̾��� ������
		// �� �ڸ��� �� bus�� �� Ŭ���� Ÿ������ �ڵ���ȯ��
		
		// ��) int sum = 0;
		// void sum(int x) {
		// sum += x;
		// }	
		// sum(5)  
		// �� ���  �Ű����� x �ڸ��� ���� 5�� ���� int x = 5 ;
		// �̷��� �Ű����� �ڸ��� ���� ���� ���� �ȴ�
		
		driver.drive(taxi);
		// �ڵ� Ÿ�� ��ȯ : Vehicle vehicle = taxi;
		// "�ýð� �޸��ϴ�" ���
		// �������̵� �޼ҵ带 ����ϱ� ������ vehicle �ƴ� taxi�� �ִ� run �޼ҵ� ���
	}

}
