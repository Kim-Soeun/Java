package sec01;

public class CarExample {

	public static void main(String[] args) {

		System.out.println("���� ����մϴ�");
		System.out.println();
		
		
		// �Ű������� �͸� ���� ��ü ����
		// ������ ���� ����
		// �����尡 �� ���� ��ġ�� ������ �ݺ������� �ڿ� ��µǴ� ������
		// ���� ���� �ȿ� �ִ� �޼ҵ尡 �켱 �����̱� ����
		// �����带 ���� ����ϰ� ������ �Ͻ������ϴ� �ð��� �ٿ��ָ� ��
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=50; i<=200; i+=50) {
					try { Thread.sleep(500);} catch(Exception e) {}
					System.out.println("���� �ӵ� : " + i + "km");
				}
			}
			
		});
		thread.start();
		
		
		
		
		for(int i=1; i<=4; i++) {
			try { Thread.sleep(500);} catch(Exception e) {}
			System.out.print("�ӵ��� �ø��ϴ�.");
		}
		
		
		
		
		try { Thread.sleep(500);} catch(Exception e) {}
		System.out.println();
		System.out.println("���� ����ϴ�");
		
	}

}
