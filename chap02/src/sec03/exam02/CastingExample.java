package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 10;
		byte byteValue = (byte)intValue;
		
		System.out.println(byteValue);
		
		int a = 44032;
		char charValue = (char) a; //���� Ÿ�� ��ȯ
		System.out.println(charValue); // '��' ���
		
		double doubleValue = 3.14;
		int b = (int) doubleValue;
		System.out.println(b); // ������ 3�� ���
	}

}
