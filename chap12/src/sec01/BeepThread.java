package sec01;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	
	// Thread Ŭ���� ��� �� run() �޼ҵ� �������ؼ�
	// �����尡 ������ �ڵ� �ۼ�

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch (Exception e) {}

		}

	}

}
