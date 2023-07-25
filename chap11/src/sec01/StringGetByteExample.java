package sec01;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String str = "�ȳ��ϼ���";
		byte[] byte1 = str.getBytes();
		// �⺻���ڼ¿��� ���ĺ��� 1����Ʈ, �ѱ��� 2����Ʈ�� ��ȯ
		System.out.println(byte1.length); // 10
		
		byte[] byte2 = str.getBytes("UTF-8");
		// UTF-8���� ���ĺ��� 1����Ʈ, �ѱ��� 3����Ʈ�� ��ȯ 
		System.out.println(byte2.length); // 15
		
		
	}

}
