package test;

import java.util.Scanner;

public class �ݺ�����2 {

	public static void main(String[] args) {
		
		// ��ǻ��, ���ϰ� ������ ����(��,��,��,��,��)
		// 1 - ���ӽ��� 2- ���� ����
		// 1�� ������ ��ǻ�� �������� ����� ��� -> ��) ��ǻ�� : ��
		// 1�� ������ ���� �������� ����� ��� -> ��) �� : ��
		// ��� ���   ->   ��) ���� �̰���ϴ� 

		Scanner s = new Scanner(System.in);

		boolean game = true;
		while (game) {
			System.out.println("������ ������ �����մϴ�");
			System.out.println("1�� ���� ����, 2�� ���� ����");
			int start = s.nextInt();

			if (start == 2) {
				System.out.println("������ �����մϴ�");
				game = false;
			} else {
				
				int comNum = (int)(Math.random()*5)+1;
				int myNum = (int)(Math.random()*5)+1;
				char result2 = result1(comNum);
				char result3 = result1(myNum);
				
				System.out.println("��ǻ�� ��� : " + result2);
				System.out.println("���� ��� : " + result3);
				
				if (comNum>myNum) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}	else if(comNum<myNum) {
					System.out.println("���� �̰���ϴ�");
				}	else {
					System.out.println("�����ϴ�");
				}
					
				
			}
			
		}
	}
	
	static char result1(int x) {
		char result = ' ';
		switch(x) {
			case 1 :
			result = '��';
			break;
			case 2 :
				result = '��';
				break;
			case 3 :
				result = '��';
				break;
			case 4 :
				result = '��';
				break;
			default :
				result = '��';
				break;
		}	return result;
	}	

	
		
}
