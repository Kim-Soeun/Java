package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {

//		SmartPhone sp = new SmartPhone();
//		
//		System.out.println(sp.cost);
//		// �θ�, �ڽ� ��� cost�� ������
//		// �⺻�����δ� �ڽ��� �ʵ带 ������
		
		Phone p = new SmartPhone();
		// �ڽ� ��ü�� �θ� ��ü Ÿ�� ��ȯ ��Ŵ(�ڵ� ��ȯ)
		System.out.println(p.cost); // �θ� Ŭ������ cost �����
		p.powerOn();
		p.ring();				// �������̵� �޼ҵ� ȣ��
//		p.videoOn();			// �ڽ� Ŭ���� �޼ҵ� ȣ�� �ȵ�
//		p.phoneCase="�ϵ����̽�";  // �ڽ� Ŭ���� �ʵ� ��� �ȵ�
	
		SmartPhone sp = (SmartPhone) p;
		// �θ� ��ü�� �ڽ� ��ü�� ���� Ÿ�� ��ȯ ��Ŵ
		
		sp.phoneCase="����Ʈ���̽�";	// �ڽ� ��ü �ʵ峪 �޼ҵ� ��� ����
		sp.powerOn();				// �θ� ��ü �޼ҵ� ��� ����(��ӹ޾ұ� ����)
		System.out.println(sp.cost);// ���� �̸��� �ʵ�� �ڽ� ��ü ���
		
//		Phone p2 = new Phone();
//		SmartPhone sp2 = (SmartPhone)p2;
//		�ڽ� Ÿ���� �θ� Ÿ������ ��ȯ���� ���� ���¿���
//		�θ� Ÿ���� �ڽ� Ÿ������ ���� ��ȯ�� ���� ����
		
	}

}
