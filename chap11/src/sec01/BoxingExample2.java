package sec01;

public class BoxingExample2 {

	public static void main(String[] args) {
		
		
		// �ڽ��� ���� Ŭ������ ��ü�� ����� ��
		// �Ű������� �⺻Ÿ�� or ���ڿ� ���� ����
		// but, �Ű������� "����" �����ϸ� ���ܹ߻�
		// String "����"�� int�� �ٲ� �� ���� ����
		

		// Integer obj1 = new integer(100);    // ���� �ڽ� �ڵ�
		// ���԰��� int Ÿ���̸� �ڵ����� �ڽ�����
		Integer obj = 100;
		System.out.println(obj);
		
		// int value = obj.intValue();			// ���� ��ڽ� �ڵ�
		// ���԰��� int Ÿ���̸� �ڵ����� ��ڽ�����
		int value = obj;
		System.out.println(value);
		
		// ����!!    
		Integer obj2 = new Integer("100");		// ���� 100�� ��
		// int value2 = Integer.parseInt(obj2);
		// Integer.parseInt�� String Ÿ���� Int Ÿ������ ����
		// obj2�� ���� String�� �ƴϱ� ������ ��� �Ұ��� 
		int value2 = Integer.valueOf(obj2);		
		// obj2�� Ÿ���� int wrapper Ŭ�����̱� ������ valueOf ��� 
		
		
		int value3 = Integer.parseInt("300");	// "300" String �Ű����� int�� ��ȯ
		System.out.println(value3);  			// 300 ���(int)
		byte value4 = Byte.parseByte("10");		// "10" String �Ű����� byte�� ��ȯ
		System.out.println(value4);				// 10 ���(byte)
		
	}

}
