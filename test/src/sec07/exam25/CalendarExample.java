package sec07.exam25;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		// Calendar ��ü�� �̿��Ͻÿ�. ���α׷��� ������ ���� �ð��� 4�ÿ��� �� 12�� �����̸� "Good Morning"��,
		// ���� 6�� �����̸� "Good Afternoon"��, �� 10�� �����̸� "Good Evening"��, 
		// �� ���Ĵ� "Good Night"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// ���� �ð��� 10�� 22���Դϴ�.
		// Good Morning
		
		

		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int ampm = now.get(Calendar.AM_PM);     // 0 : ����, 1 : ����
		
		System.out.println("���� �ð��� " + hour + "�� " + minute + "���Դϴ�");
		 
		if (ampm==1) {
			hour += 12;
		}
		
		if(hour>=4 && hour<=12) {
			System.out.println("Good Morning");
		} else if(hour>=12 && hour<=18) {
			System.out.println("Good Afternoon");
		} else if(hour>=18 && hour<=22) {
			System.out.println("Good Night");
		} else {
			
		}
		
		
	}

				
}
