package sec07.exam17;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("�ο����� �Է��ϼ���");
		int num = s.nextInt();
		Phone[] phone = new Phone[num];

		int i;
		// �������� i ������

		// �迭�� ���̸�ŭ �ݺ��ؼ� �̸��� ��ȭ��ȣ�� �Է¹޾�
		// �� �迭�� �濡 Phone ��ü�� �����Ͽ� ����
		for (i = 0; i < phone.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ ���� �Է�");
			String name = s.next();
			String tel = s.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�");

		while (true) {
			System.out.println("�˻��� �̸� : ");
			String name = s.next();
			for (i = 0; i < num; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "�� ��ȭ��ȣ�� " + phone[i].getTel());
					break; // ã�� �����Ͱ� ������ �̸��� ��ȣ ��� �� for�� ����
				}
			}

			if (name.equals("�׸�")) {
				break;  // �׸��� �Է��ϸ� while ����
			}

			if (i == num) {	
				System.out.println(name + "�� �����ϴ�");  // ã�� �����Ͱ� ������ ���ٴ� �ȳ��� ���
			}
		}
	}

}
