package test;

import java.util.Scanner;

public class Ȯ�ι���re {

	public static void main(String[] args) {

//			98p ���빮��
//		1������ : Scanner Ȱ��
//		����� �̸���?
//		�߰���� ����? ���� �Է� �ޱ�   	 double
//		�⸻��� ����?                	double
//		����Ʈ ������?  				double
		
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("�߰���� ����?");  // ��) 83.67
		double mid = s.nextDouble();
		System.out.println("�⸻��� ����?");
		double last = s.nextDouble();
		System.out.println("����Ʈ ������?");
		double report = s.nextDouble();
		
//		printf ���   ȫ�浿���� ��� ������ : 73.25 �Դϴ�
		
		double average = (mid + last + report) / 3;
		System.out.printf("%s���� ��� ������ %5.2f �Դϴ�", name, average);
		
	}

}
