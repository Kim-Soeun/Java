package sec03.exam07;

public class Ȯ�ι��� {

	public static void main(String[] args) {

//		86p. 1�� ����
		int intValue = 10;
		char charVale = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		

//		2�� ����
		double var = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
//		char var4 = (char) strValue; ����
//		char var4 = strValue.charAt(0); ���ڿ� - > ���� : charAt ����ϱ�

		byte byteValue = 10;
		float floatValue = 2.5f;
		double doubleValue2 = 2.5;

//		3������
//		byte result = byteValue + byteValue; 
		int result = byteValue + byteValue;
		int result2 = 5 + byteValue;
		float result3 = 5 + floatValue;
		double result4 = 5 + doubleValue;

//		5�� ����
		char c1 = 'a';
		int c2 = c1 + 1;
		System.out.println((char) c2);

//		6�� ����
		int x = 5;
		int y = 2;
		double result5 = (double) x / y; //int result5 = x/y : ������ ��µ�
		System.out.println(result5);
		
//		8�� ����
		double var5 = 3.5;
		double var6 = 2.7;
		int result6 = (int) (var5 +  var6); // double�� �ϳ��� ��� ok, int�� ��� ���������
		System.out.println(result6);

	}

}
