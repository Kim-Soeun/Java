package sec01;

public class BoxingExample {

	public static void main(String[] args) {

		// Wrapper Ŭ���� �ڽ�(����)
		Integer obj1 = new Integer(100);		// �Ű��� : �⺻Ÿ��
		Integer obj2 = new Integer("100");		// �Ű��� : ���ڿ�
		Integer obj3 = Integer.valueOf("300");	// ������ �̿� x, ���� Ŭ������ �ִ� ���� �޼ҵ� valueOf() ���
		
		// Wrapper Ŭ���� ��ڽ�(���� ����)
		int value1 = obj1.intValue();			// �ٽ� �⺻Ÿ�� ��� ���� ��ڽ�
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
//		Integer obj4 = 100;						// �ڵ� �ڽ�
//		int value4 = obj4;						// �ڵ� ��ڽ�
//		Integer obj5 = "100";					// int, String Ÿ���� �޶� �ڵ� �ڽ� �ȵ�

		
		// ���� ��ü ��
		Integer obj4 = new Integer(100);
		Integer obj5 = new Integer(100);
		System.out.println(obj4==obj5);  		// false(���� Ŭ���� ��)
		
		int num1 = 100;
		int num2 = 100;
		System.out.println(num1==num2);  		// true(���� ��)
		
		
		if(obj4==obj5) {
			System.out.println("true");			// false
		} else {
			System.out.println("false");
		}
		
	}

}
