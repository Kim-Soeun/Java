package sec01;

import java.util.Calendar;

public class �ڹٸ����ϻ� {

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
		
		// ���� ��¥ ���
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		System.out.println("������ " + year + "�� " + month + "�� " + date + "�� �Դϴ�");

		// Runnable ���� ��ü
		Runnable wake = new Wake();
		Thread thread1 = new Thread(wake);
		thread1.start();
		

		// �͸� ���� ��ü
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try { Thread.sleep(600);} catch (Exception e) {}
				System.out.println("�����մϴ�");

			}

		});
		thread2.start();
		

		// ��� ���
		Thread thread3 = new Sleep();
		thread3.start();

	
		// ���� ��¥ ��� & ������ �ݺ�
		try {Thread.sleep(800); } catch(Exception e) {}
		System.out.println("������ " + year + "�� " + month + "�� " + (date+1) + "�� �Դϴ�");
		
		Thread thread4 = new Thread(wake);
		thread4.start();
		
		Thread thread5 = new Thread(new Runnable() {
			@Override
			public void run() {
				try { Thread.sleep(600);} catch (Exception e) {}
				System.out.println("�����մϴ�");

			}
		});
		thread5.start();
		

		Thread thread6 = new Sleep();
		thread6.start();
		
	}

}
