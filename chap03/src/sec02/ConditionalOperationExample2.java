package sec02;

import java.util.Scanner;

public class ConditionalOperationExample2 {

	public static void main(String[] args) {

//		����ڰ� ������ �Է��մϴ�
//		������ 90�� �̻� "��", 80�� �̻� "��" ������ "��"
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = s.nextInt();
		char grade = (num > 90) ? '��' : (num > 80) ? '��' : '��';
		System.out.println(num + "���� '" + grade + "' ����Դϴ�");
		
	}

}
