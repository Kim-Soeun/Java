package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
		
//		����б��� �Է��ϼ���.
//		����ڰ� �Է��� ������ �����ڵ带 ����մϴ�.
//		��) �Է��Ͻ� '��'�� �����ڵ�� 49324 �Դϴ�.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("����б��� �Է��ϼ���.");
		String a = s.next();
		char b = a.charAt(2);
		
		System.out.println("���� ���г� �ΰ���?");
		int c = s.nextInt();
		
		if(b=='��') {
			System.out.print("����� ���л� ");
		} else {
		System.out.print("����� ����л� ");
		}
		
		
		
		System.out.println(c + "�г� �Դϴ�.");
		
		
	}

}
