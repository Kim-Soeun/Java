package sec03;

import java.util.Calendar;

public class ����������2 {

	public static void main(String[] args) {

//		������ Part (�ϻ�б�, �̻�б�, ���б�, ���б�)
//		Calendar ���� ������
//		���� ���� ���б� �Դϴ� ���
		
		Part now = null;
		
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH)+1;
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			now = Part.�ϻ�б�;
			break;
		case 4:
		case 5:
		case 6:
			now = Part.�̻�б�;
			break;
		case 7:
		case 8:
		case 9:
			now = Part.���б�;
			break;
		case 10:
		case 11:
		case 12:
			now = Part.���б�;
			break;
			
		}
			System.out.println("���� ���� " + now + "�Դϴ�");
	}

}
