package sec02;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();	
		// car ��ü ����
		// car ��ü�� Car Ŭ������ �ʵ�, �޼ҵ� ��� ������
		
		for(int i=1; i<=5; i++) {	//5�� �ݺ�
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1 :
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire(15, "�տ���");
			case 2 :
				System.out.println("�տ����� ��ȣŸ�̾�� ��ü");
				car.frontRightTire = new KumhoTire(13, "�տ�����");
			case 3 :
				System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
				car.backLeftTire = new HankookTire(14, "�ڿ���");
			case 4 :
				System.out.println("�ڿ����� ��ȣŸ�̾�� ��ü");
				car.backRightTire = new KumhoTire(17, "�ڿ�����");
			}
			System.out.println("-------------------");
		}
		
	}

}
