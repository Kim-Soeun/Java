package sec02;

import java.util.Scanner;

public class �¼��� {

	public static void main(String[] args) {

//		�л��� ���?
//		���ٿ� ��� �ɳ���?

//		�� ~���̰� ���� �¼����� ~�� �Դϴ�

		Scanner s = new Scanner(System.in);
		System.out.println("�л����� ����ΰ���?");
		int num1 = s.nextInt();
		System.out.println("���ٿ� ��� �ɳ���?");
		int num2 = s.nextInt();

		int i = num1 % num2;
		int i2 = num1 / num2;

		int result1 = (i == 0) ? i2 :i2 + 1;
		int result2 = (i ==0 ) ? i : num2 - i;
		
//		int result1 = (num1 % num2 == 0) ? num1 / num2 : num1 / num2 + 1; // �� �� ��
//		int result2 = (num1 % num2 == 0) ? num1 % num2 : num2 - num1 % num2; // ���� �л� ��

		System.out.printf("�� %d���̰� ���� �¼����� %d�� �Դϴ�\n", result1, result2);

	}

}
