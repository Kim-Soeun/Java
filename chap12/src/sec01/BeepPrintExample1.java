package sec01;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		
		// ���� �����常 �̿��� ���
		// ������ �߻��� ����� ���� �ٸ� �۾��̹Ƿ� 
		// ���� �����尡 ���ÿ� �� ���� �۾� ó���� �� ����
		// ������ ���� �ۼ��� ���� ������� ������ ��� �߻� �� ��� ����
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();			// Toolkit ��ü ���
		for(int i=0; i<5; i++) {
			toolkit.beep();   									// �Ҹ� ���
			try { Thread.sleep(500); } catch(Exception e) {}	// Thread.sleep(500) : 0.5�ʰ� �Ͻ�����
		}
		
		for(int i=0; i<5; i++) {								// ������ ��� �߻� �� ��� ����
			System.out.println("��");
			try {Thread.sleep(500); } catch(Exception e) {}
		}
		
	}

}
