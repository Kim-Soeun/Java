package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class �̿�� {

	public static void main(String[] args) {

		// Calendar ���� ����
		// ����� �̸� �Է� ����
		// �̿�� �̿� �׸� �Է� ����
		// ĿƮ(8000��), �ĸ�(20000��), ����(25000��), ����(60000��)
		// ���� �湮�ð��� �����̸� 30% ����
		// �湮�ð��� �� 12�� ~ �� 6�� 10% ����
		// ������ ���� x
		// ��) ȫ�浿 �ĸ�  ->  ȫ�浿���� �����ݾ��� 18000���Դϴ�
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("������� �̸��� �Է��ϼ���");
		String name = s.next();
		System.out.println("�̿� �׸��� �Է��ϼ���");
		String category = s.next();
		int cost;
		
		
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int ampm = now.get(Calendar.AM_PM);
		
		
		
		switch(category) {
		
		case "ĿƮ" :
			cost = 8000;
			break;
		case "�ĸ�" :
			cost = 20000;
			break;
		case "����" :
			cost = 25000;
			break;
		case "����" :
			cost = 60000;
			break;
		default :
			cost = 0;
			System.out.println("���� �׸� �Դϴ�");
		}
		
		
		if (hour<=12 && ampm==0) {
			cost *= 0.7;
		} else if(hour<=6 && ampm==1) {
			cost *= 0.9;
		}
		
		
		System.out.println(name + "���� �����ݾ��� " + cost + "���Դϴ�");
		
	}

}
