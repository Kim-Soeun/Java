package sec01;

public class MyPointExample {

	public static void main(String[] args) {

		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		// System.out.println�� Ŭ���� p�� ������
		// toString ���� ����
		// �������̵� ���� �ʾ����� �ؽ��ڵ� ���� ��������
		// �������̵� �߱� ������ �������� ���ڿ��� ������ ��µ�
		
		if(p.equals(q))
			// �Ű����� obj�� q�� �����ؼ� ����
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");
		
	}

}
