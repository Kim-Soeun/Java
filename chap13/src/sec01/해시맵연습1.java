package sec01;

import java.util.*;

public class �ؽøʿ���1 {

	// ����� �α����� ��ĳ�� �̿��Ͽ� 3���� �Է� ��������
	// ��) �ѱ� 5000, �Ϻ� 1200, �߱� 30000
	// �ش� �����͸� �ؽø����� ������ ��
	// ����ڰ� ���� �̸��� �Է��ϸ� �α����� ����ϴ� �ڵ带 �ۼ��ϼ���
	// ����ڰ� �׸��̶�� �Է��ϸ� �����ϼ���

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		Scanner s = new Scanner(System.in);

		
		
		System.out.println("����� �α����� 3�� �Է��ϼ���");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "��° : ");
			map.put(s.next(), s.nextInt());
		}

		
		
		while (true) {

			System.out.println("���� �Է��ϼ���");
			String country = s.next();

			if (country.equals("�׸�")) {
				System.out.println("�˻��� �����մϴ�");
				break;
			}
			
			if (map.containsKey(country)) {
				System.out.println(country + " �α��� : " + map.get(country));
			} else {
				System.out.println("�ش� ���� �����");
			}

		}

	}

}
