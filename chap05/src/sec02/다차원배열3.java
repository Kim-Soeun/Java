package sec02;

import java.util.Scanner;

public class �������迭3 {

	public static void main(String[] args) {

//		�ݺ��� �̿��Ͽ� 3���� �̸��� �Է� ��������
//		��) ö��, ����, ����
//		3�� 2ĭ ¥�� �迭 ����
//		ù��° ĭ�� �߰����, �ι�° ĭ�� �⸻��� �����Դϴ�
//		����ڷκ��� ���������� �ݺ��� �̿��Ͽ� �Է� ��������
//		3���� ��������� ����ϼ���
//		��) ö�� ������� : 57.9��

		Scanner s = new Scanner(System.in);
		String[] name = new String[3];
		for(int i=0; i<name.length; i++) {
			System.out.println((i+1) + "��° ��� �̸��� �Է��ϼ���");
			name[i] = s.next();
		}

		int[][] scores = new int[3][2];
		double[] result = new double[3];
		
		for(int i=0; i<scores.length; i++) {
			int sum=0;
			for(int j=0; j<scores[i].length;j++) {
				if(j==0) {
					System.out.println(name[i] + "�� �߰������� �Է��ϼ���");
				}	else {
					System.out.println(name[i] + "�� �⸻������ �Է��ϼ���");
				}	scores[i][j] = s.nextInt();
					sum += scores[i][j];
			}	result[i] = (double) sum/2;
		}

		for(int i=0; i<result.length; i++) {
			System.out.println(name[i] + "�� ��������� " + result[i] + "�Դϴ�");
		}
	}

}
