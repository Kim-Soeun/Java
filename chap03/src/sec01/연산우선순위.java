package sec01;

import java.util.Scanner;

public class ����켱���� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���� �ϳ��� �Է��ϼ���");
		int num1 = s.nextInt();
		System.out.println("������(+,-)�� �Է��ϼ���");
		String oper = s.next();
//		���� �����ڰ� +�� �Է��� ���ڿ��� 1�� �������� ����ϰ�
//		�����ڰ� -�� �Է��� ���ڿ��� 1�� ���ҽ��� ����ϼ���
//		int i = 0;
//		i++; : 1���
//		System.out.println(i++); : ���� ������ �Ŀ� ���� �� = 0
//		System.out.println(++i); : ���� �����Ǳ� ���� ���� �� = 1
		
		if (oper.equals("+")) {
			num1++;					
			num1++;					
		} else if (oper.equals("-")) {
			num1--;
		}
		System.out.println(num1);
		
		
	}

}
