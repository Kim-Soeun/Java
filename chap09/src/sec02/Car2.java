package sec02;


public class Car2 {
	
	// �ʵ尪���� �͸� ��ü�� �����ϼ���
	// car �޼ҵ� �������̵� �ϰ�
	// speedUp(int speed) �޼ҵ� ���弼��
	
	Car car = new Car() {
		int speed;
		
		
		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("�ӵ��� " + speed + "��ŭ �����մϴ�");
		}
		
		@Override
		void stop() {
			System.out.println("�ڵ����� ����ϴ�");
			speedUp(50);
		}
		
		
	};
	
	// ���� �͸� ��ü ����
	void speedDown() {
		Car downCar = new Car() {
			
			void speedReduce(int speed) {
				this.speed -= speed;
				System.out.println("�ӵ��� " + speed + "��ŭ �����߽��ϴ�");
			}
			
			@Override
			void stop() {
				System.out.println("Car�� ����ϴ�");
				speedReduce(30);
			}
			
		};
		// speedDown() �޼ҵ带 ȣ���ϸ� �͸� ��ü����
		// �޼ҵ尡 �ڵ����� ������� ����
		// �׷��� �Ʒ� �ڵ� �ʿ���
		downCar.stop();
		
	}
	
}
