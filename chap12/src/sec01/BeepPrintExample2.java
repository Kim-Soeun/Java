package sec01;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		// ��Ƽ ������ : �ϳ��� ���μ����� �� ���� �̻��� �۾��� ó���� �� �ִ� ���
		// ���� ������� �۾� �����尡 ���ÿ� ����
		// ���� ������ : ���,   �۾� ������ : ������ �߻�
		
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		// start() �޼ҵ� ȣ���ؾ� �۾������� ����� 
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500); } catch(Exception e) {}
		}
		
	}

}
