package sec07.exam25;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �����մϴ�");
		String str = s.nextLine();
		
		for(int i=1; i<=str.length(); i++) {
			char first = str.charAt(0);
			str = str.substring(1) + first;
			System.out.println(str);
		}
		
	}

}
