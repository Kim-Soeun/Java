package sec01;

public class StudentExample {

	public static void main(String[] args) {

//		Student ��ü ����(�Ű����� 3��)
//		�ڱ� �޼ҵ� 1�� ȣ��
//		�θ� �޼ҵ� 2�� ȣ��  -> ��� Ȯ��
		
		Student student = new Student(50, 165, 12345);
		
		student.study("������");		// �ڱ� �޼ҵ� ȣ��
		
		String result1 = student.eat("������ġ");  // �������̵� �޼ҵ�
		System.out.println(result1);
		String result2 = student.run(20);		// �θ� �޼ҵ� 2�� ȣ��
		System.out.println(result2);
		
		
	}

}
