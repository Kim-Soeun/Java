package sec02;

public class PrintThread3 extends Thread {

	@Override
	public void run() {

	
			while(true) {
				System.out.println("���� ��");
				
				// interrupt() �޼ҵ� ȣ���ϸ� 
				// �������� interrupted(), isinterrupted() �޼ҵ�� true ����
				// if ����ż� break; ����   ->    while�� �������� 
				if(Thread.interrupted()) {		
					break;						
				}
			}
		

		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
		
		
	}

}
