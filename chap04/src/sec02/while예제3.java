package sec02;

import java.util.Scanner;

public class while����3 {

	public static void main(String[] args) {

//		int Ÿ���� ���� num�� �����ϰ� Ű����� ���� �Է� ��������
//		1~���� num���� ���� ����ϴ� ���α׷��� �ۼ��غ�����.(while)
//		��) ���� �Է� : 10
//		1~10 ��: 55
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i<=num) {
			sum += i;  // 0 + 1 + ... num 
			i++;
		}
			System.out.println("1 ~ " + num + " �� : " + sum);
					
		}
		
	}


