package sec01;

import java.util.Scanner;

public class ReplaceExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		String address = s.nextLine();		
		// .nextLine() : enter ������ ��� ���ڿ�
		// .next() : space �� ���ڿ�(�� �ܾ�)
		String addressNew = address.replace("����", "���ֱ�����");
		// replacefirst() : �ѱ��ڳ� �Ѵܾ ��ü
		System.out.println(addressNew);
		
		
	}

}
