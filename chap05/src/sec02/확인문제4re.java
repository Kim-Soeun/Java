package sec02;

import java.util.Scanner;

public class Ȯ�ι���4re {

	public static void main(String[] args) {

//		����ڷκ��� �迭 ������ �Է� ��������
//		�迭 ������ŭ ���ڸ� �Է� �޾Ƽ� �迭�� �����ϼ���
//		�ش� �迭���� ���� ���� ���ڸ� ����ϼ���
//		(��, ���ڴ� ����� ������)
		
		Scanner s = new Scanner(System.in);
		System.out.println("�迭 ������ �Է��ϼ���");
		int array = s.nextInt();
		int[] num = new int[array];
		
		for(int i =0; i<num.length; i++) {
			System.out.println((i+1) + "��° ���ڸ� �Է��ϼ���");
			num[i] = s.nextInt();
		}
		
		int min = num[0]; 
		for(int i=0; i<num.length; i++) {
			if(num[i]<min) {
				min = num[i];
			}	
		}	System.out.println("min : " + min);
		
	}

}
