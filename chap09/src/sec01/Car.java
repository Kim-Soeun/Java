package sec01;

public class Car { // �ν��Ͻ� ��� Ŭ����

	String company;
	int speed;
	int cost;
	static String color;

	Car() { 		// �⺻ ������
		System.out.println("Car ȣ��");
	}

	
	
	class OldCar { // ��ø Ŭ����(�ν��Ͻ� ��� Ŭ����)

		int speed;
		int cost;

		OldCar() {
			System.out.println("OldCar ȣ��");
		}

		void speedUp(int speed) {
			this.speed += speed;

		}
		
		void carCall() {
		// �ν��Ͻ� ���� Ŭ������ �޼ҵ忡��
		// �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� ������ 
		// �ν��Ͻ� Ŭ���������� ��� �ʵ�� �޼ҵ� ���� ����
			company="����";
			stop();		// �ν��Ͻ� �޼ҵ� ���� ����
			stop2();	// ���� �޼ҵ� ���� ����
		}
	}

	
	
	static class Truck {  	// ��ø Ŭ����(���� ��� Ŭ����)
		int cost;			// �ʵ忡 static �ᵵ �ǰ� �Ƚᵵ ��
		static int speed;

		Truck() {
			System.out.println("Truck ȣ��");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}
		
		void carCall() {
			// ���� Ŭ������ �޼ҵ忡��
			// �ٱ� Ŭ������ �ν��Ͻ� �ʵ�, �޼ҵ� ���� x
			// �ٱ� Ŭ������ ���� �ʵ�, �޼ҵ� ���� o
			//	company="����";
			//	stop();
			color = "����";
			stop2();		// �Ѵ� static �̶� ���� ����
			}

	}

	
	
	void speedUp(int speed) {
		this.speed += speed;
	}

	void stop() {
		System.out.println("Car ����");
	}
	
	static void stop2() {
		System.out.println("Car2 ����");
	}
	
}
