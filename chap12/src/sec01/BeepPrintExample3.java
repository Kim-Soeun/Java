package sec01;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {

		// ������ �Ű������� Runnable�� �͸� ���� ��ü �����Ͽ� �־���
		// ���ÿ� ���� ������� �۾� ������ �����
		
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit ��ü ���
				for (int i = 0; i < 5; i++) {
					toolkit.beep(); // �Ҹ� ���
					try {Thread.sleep(500);} catch (Exception e) {} // Thread.sleep(500) : 0.5�ʰ� �Ͻ�����
				}

			}

		});
		thread.start();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}

}
