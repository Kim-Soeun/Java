package sec01;

public class ���尪�� {

	public static void main(String[] args) {

		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("��� : " + (obj1 == obj2));
		// false ���
		System.out.println("��ڽ��� ��� : " + (obj1.intValue() == obj2.intValue()));
		// true ���
		
		
		// Integer num1 = new Integer(100)    :  ���� �ڽ� �ڵ�
		
		// �ڵ� �ڽ�
		Integer num1 = 100;
		Integer num2 = 100;
		Integer num3 = 300;
		Integer num4 = 300;
		
		System.out.println(num1 == num2);		// true (byte ���������� ������ �� ����)
		System.out.println(num3 == num4);       // false(byte ���� �ۿ����� �� �� x)
		System.out.println(num3.equals(num4));  // true(�׷��� �׳� ����Ŭ���� �� ���� ���� equals ����) 
	}

}
