package sec02;

import java.util.Scanner;

public class �¼���2 {

	public static void main(String[] args) {

//		�л��� ���?
//		���ٿ� ��� �ɳ���?
//		��) �� �л��� 24��, ���� 5��
//		��) �� 5���̰� ���� �¼����� 1���Դϴ�
//		�� ~���̰� ���� �¼����� ~�� �Դϴ�

		Scanner s = new Scanner(System.in);
		System.out.println("�л����� ����ΰ���?");
		int student = s.nextInt();
		System.out.println("���ٿ� ��� �ɳ���?");
		int seat = s.nextInt();
		
		int line = student / seat; 
		int remainseat = student % seat;
		
		if (remainseat != 0) {
			++line;
			remainseat = seat - remainseat;
		} 	
		
		
		System.out.printf("�� %d���̰� ���� �¼����� %d�� �Դϴ�\n", line, remainseat);
		

	}

}
