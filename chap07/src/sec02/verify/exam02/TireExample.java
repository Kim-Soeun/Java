package sec02.verify.exam02;

public class TireExample {

	public static void main(String[] args) {

		SnowTire snowtire = new SnowTire("��ȣ", 10, "TRX");
		Tire tire = snowtire;
		
		snowtire.rotate();
//		tire.rotate();	// �θ�� Ÿ�Ժ�ȯ �߱� ������ �ڽ� �޼ҵ� ȣ�� x
		tire.run();		// �θ� �޼ҵ� �ƴ� �������̵��� �޼ҵ� ȣ��
		
	}

}
