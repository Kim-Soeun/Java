package sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {

		// 2���� �̸��� ó���ڵ带 �Է� ��������
		// ��) ȫ�浿 C88, �嵿�� B70
		// �� �� ���ڴ� ���, ������ 2���ڴ� �����Դϴ�
		// ����� A~D��ޱ��� �����ϰ�
		// A����� ������ 20% ����, B����� ������ 10% ����
		// C����� ������ 5% �����Դϴ�

		// ���������� 90�� �̻��̸� "�ֿ��", 80 �̻��̸� "���"
		// �������� "�Ϲ�"
		// ���� ��� -> ȫ�浿���� �ֿ�� ����Դϴ�

		Scanner s = new Scanner(System.in);
		String[] names = new String[2];
		String[] code = new String[2];
		int[] score = new int[2];

		for (int i = 0; i < 2; i++) {
			System.out.println(i+1 + "��° �̸��� ó���ڵ带 �Է��ϼ���");
			names[i] = s.next();
			code[i] = s.next();
		}

		for (int i = 0; i < 2; i++) {
			String num = code[i].substring(1);
			score[i] = Integer.parseInt(num);
			
			switch (code[i].charAt(0)) {
			case 'A': case 'a' :
				score[i] *= 1.2;
				break;
			case 'B': case 'b':
				score[i] *= 1.1;
				break;
			case 'C': case 'c':
				score[i] *= 1.05;
				break;
			default :
				score[i] = 0;
				break;
			}
		}
		
		for(int i=0; i<2; i++) {
			if(score[i]>=90) {
				System.out.println(names[i] + "���� �ֿ�� ����Դϴ�");
			} else if(score[i]>=80) {
				System.out.println(names[i] + "���� ��� ����Դϴ�");
			} else if(score[i]==0){
				System.out.println(names[i] + "���� �߸� �Է� �ϼ̽��ϴ�");
			} else {
				System.out.println(names[i] + "���� �Ϲ� ����Դϴ�");
			}
		}

	}

}
