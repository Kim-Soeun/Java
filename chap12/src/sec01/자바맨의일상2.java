package sec01;

import java.util.Calendar;

public class �ڹٸ����ϻ�2 {

	public static void main(String[] args) {

		// �ڹٸ��� �ϻ� (����)

		// ���� ��¥ ��� -> ������ 2023�� 7�� 28�� �Դϴ� (����)
		// ����մϴ� -> ������(�⺻ ���, Ŭ����)
		// �����մϴ� -> ������(�͸� ���� ��ü)
		// ���� ��ϴ� -> ������(��� ���)

		// ���� ��¥ ��� -> ������ 2023�� 7�� 29�� �Դϴ� (����)
		// ����մϴ� -> ������
		// �����մϴ� -> ������
		// ���� ��ϴ� -> ������

		System.out.println("�ڹٸ��� �ϻ�");
		
		

		

		// �⺻���
		Runnable wake = new Wake();
		Thread thread1 = new Thread(wake);
		thread1.start();
		

		
		// �͸� ���� ��ü
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
				try {
					Thread.sleep(600);
				} catch (Exception e) {
				}
				System.out.println("�����մϴ�");

			}
			}
		});
		thread2.start();

		
		
		// ��� ���
		Thread thread3 = new Sleep();
		thread3.start();
	

		
		Calendar cal = Calendar.getInstance();
		
		
		for (int i = 0; i < 2; i++) {

			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH) + 1;
			int date = cal.get(Calendar.DATE);
			System.out.println("������ " + year + "�� " + month + "�� " + date + "�� �Դϴ�");

			
			cal.add(Calendar.DATE, 1);
			
			try {
			Thread.sleep(800);
			} catch (Exception e) {
			}
			
		}
		
		
	}

}
