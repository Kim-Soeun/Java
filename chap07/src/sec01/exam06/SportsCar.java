package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() { speed += 10; }

//	@Override						
//	public void stop() {
//		System.out.println("������ī�� ����");
//		speed = 0;
//	}
//	      -> �������̵� �ȵ�(�޼ҵ� stop�� final�� �����߱� ������)
	
	
	public void stop(int x) {
		// ���ϰ��̳� �Ű������� �����ϸ� �޼ҵ� �������̵� x
		System.out.println("������ī�� ����");
		speed=0;
	}
}
