package sec03;

public class �����ڿ������� {

	public static void main(String[] args) {
		
//		1. �⺻ �����ڷ� ��ü�� ������ �� �̸��� ���� ���
//		2. �Ű����� 2�� �����ڷ� ��ü ������ ��
//		�̸��� ȫ���� ���̴� 30���� ���� �� ���
//		3. �Ű����� 3�� �����ڷ� ��ü ������ ��
//		�̸��� ȫ�浿 �й��� 20231111 ����ó 010-5555-7777 ������ ���
		
		Student student1  = new Student();
		System.out.println("�̸� : " + student1.name);
		System.out.println("���� : " + student1.age);
		
		Student student2 = new Student("ȫ����", 30);
		System.out.println("�̸� : " + student2.name);
		System.out.println("���� : " + student2.age);
		
		Student student3 = new Student("ȫ�浿", "20231111", "010-5555-7777");
		System.out.println("�̸� : " + student3.name);
		System.out.println("���� : " + student3.deptNum);
		System.out.println("���� : " + student3.phone);
		
		
	}

}
