package sec04;

public class CarExample {

	public static void main(String[] args) {
		
//		Car Ŭ������ �����ϼ���
//		private ������� ���ǵ� �⺻ 100
//		�õ��ɱ� powerOn  �õ����� powerOff
//		�ӵ����� speedUp  �ӵ�����  speedDown
//		����  breakZero  �޼ҵ� ����
//		�õ��ѱ� - �ӵ�����(30) - �ӵ�����(20) - 
//		�ӵ�����(70) - ���� - �õ����� 
		
		

		Car car = new Car();
		car.powerOn();
		
		int result1 = car.speedUp(30);
		System.out.println("���� �ӵ��� : " + result1);
		
		int result2 = car.speedUp(20);
		System.out.println("���� �ӵ��� : " + result2);

		int result3 = car.speedDown(70);
		System.out.println("���� �ӵ��� : " + result3);
		
		int result4 = car.breakZero();
		System.out.println("���� �ӵ��� : " + result4);
		
		car.powerOff();
		
		
		
	}

}
