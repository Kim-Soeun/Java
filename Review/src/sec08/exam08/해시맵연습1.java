package sec08.exam08;

import java.util.*;

public class �ؽøʿ���1 {

	public static void main(String[] args) {

			// ����� �α����� ��ĳ�� �̿��Ͽ� 3���� �Է� ��������
			// ��) �ѱ� 5000, �Ϻ� 1200, �߱� 30000
			// �ش� �����͸� �ؽø����� ������ ��
			// ����ڰ� ���� �̸��� �Է��ϸ� �α����� ����ϴ� �ڵ带 �ۼ��ϼ���
			// ����ڰ� �׸��̶�� �Է��ϸ� �����ϼ���
		
		Scanner s = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		System.out.println("����� �α����� �Է��ϼ���");
		for(int i=0; i<3; i++) {
			System.out.println(">> ");
			map.put(s.next(), s.nextInt());
		}
		
		while(true) {
			System.out.println("���� �Է��ϼ���");
			String country = s.next();
			
			if(country.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}
			
			if(map.containsKey(country)) {
				System.out.println(country + " �α��� : " + map.get(country));
			} else {
				System.out.println("�ش� ���� �����");
			}
		}
		
		
	}

}
