package sec02;

public class Ȯ�ι���1 {

	public static void main(String[] args) {

//		byte b = 5; -> x   int b = 5; -> o
//		b = -b             b = -b
		
		byte b = 5;
		b = (byte)-b;
//		c = Byte.parseByte(b); ���ڿ��� ���ڷ� �ٲٴ� ����̱� ������ ���� �� �� 
		int result = 10 / b;
		System.out.println(result);
		
	}

}
