package sec01;

public class switch����2 {

	public static void main(String[] args) {

//		8~11 �������� ����
//		��) [����ð� : 8��]
//		8�ø� "����մϴ�"
//		9�ø� "ȸ�Ǹ� �մϴ�"
//		10�ø� "������ ���ϴ�"
//		"�� �� : �ܱ��� �����ϴ�"
		
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[����ð� : " + time + "��]");

		switch (time) {
		case 8:
			System.out.println("����մϴ�");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�");
			break;
		case 10:
			System.out.println("������ ���ϴ�");
			break;
		default:
			System.out.println("�� �� : �ܱ��� �����ϴ�");
			break;
		}

	}

}
