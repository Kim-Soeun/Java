package sec04;

public class PrintfExample {

	public static void main(String[] args) {

//		printf("���Ĺ��ڿ�", ��1, 2��) : ��ȣ���� ù ��° ���ڿ� ���Ĵ�� ���� ���
		
		int value = 123;
		System.out.printf("��ǰ�� ����:%d��\n", value); // ��ǰ�� ����:123��
		System.out.printf("��ǰ�� ����:%6d��\n", value); // ��ǰ�� ����:   123��

		int value2 = 1234;
		System.out.printf("��ǰ�� ����:%d��\n", value2); // ��ǰ�� ����:1234��
		System.out.printf("��ǰ�� ����:%6d��\n", value2); // ��ǰ�� ����:  1234��
		System.out.printf("��ǰ�� ����:%-6d��\n", value2); // ��ǰ�� ����:1234  ��
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.3f\n",10,area); // �������� 10�� ���� ����:   314.159

		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job); //      1 | ȫ�浿        |         ����

		System.out.printf("�̸�: %s",  "���ڹ�"); // �̸�: ���ڹ�
		
	}



}
