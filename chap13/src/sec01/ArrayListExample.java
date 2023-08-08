package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {

		// Scanner Ŭ������ ����Ͽ� ����('A', 'B', 'C', 'D', 'F')�� 6�� ���ڷ� �Է¹޾�
		// ArrayList�� �����ϰ�, ArrayList�� �˻��Ͽ� ������
		// ����(A=4.0, B=3.0, C=2.0, D=1.0, F=0)�� ��ȯ�Ͽ�
		// ����� ����ϴ� ���α׷��� �ۼ��ϼ���
		
		List<Character> list = new ArrayList<>();
//		ArrayList list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ 6�� �Է��ϼ���");
		System.out.println("A B C D F �� �����ؼ� �� ĭ ���� �Է��ϼ���");
		
		for(int i=0; i<6; i++) {
			char grade = s.next().charAt(0);
			list.add(grade);
		}
		
		
		double sum = 0;			// 4.0�̱� ������ double�� ����
		double average = 0;
		
		for(int i=0; i<list.size(); i++) {
			switch(list.get(i)) {
			case 'A': case 'a':
				sum += 4.0;
				break;
			case 'B': case 'b':
				sum += 3.0;
				break;
			case 'C': case 'c':
				sum += 2.0;
				break;
			case 'D': case 'd':
				sum += 1.0;
				break;
			case 'F': case 'f':
				break;
			}
		}
		
		average = sum / 6;
		System.out.println("��� ���� : " + average);
		
		
		
	}

}
