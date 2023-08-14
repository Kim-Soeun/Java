package sec08.exam14;

import java.util.*;

public class ArrayLilstExample {

	public static void main(String[] args) {

		// Scanner Ŭ������ ����Ͽ� ����('A', 'B', 'C', 'D', 'F')�� 6�� ���ڷ� �Է¹޾�
		// ArrayList�� �����ϰ�, ArrayList�� �˻��Ͽ� ������
		// ����(A=4.0, B=3.0, C=2.0, D=1.0, F=0)�� ��ȯ�Ͽ�
		// ����� ����ϴ� ���α׷��� �ۼ��ϼ���

		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		
		System.out.println("A, B, C, D, F �� �����ؼ� 6�� �Է��ϼ���");
		for(int i=0; i<6; i++) {
		char grade = s.next().charAt(0);
		list.add(grade);
		}
		
		
		double sum=0.0;
		
		for(int i=0; i<list.size(); i++) {
			char score = list.get(i);
			
			switch (score) {
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
		double average = sum / list.size();
		System.out.println("��� : " + average);
	
		
	}

}
