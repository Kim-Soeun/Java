package sec02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		
		// Calendar Ŭ������ �ü�� �������� ����
		// Calendar Ŭ������ �ٷ� new ��ü ���� �Ұ���
		
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("���� �ð� : " + hour);
		
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
		// ���� : 0,   ���� : 1
	}

}
