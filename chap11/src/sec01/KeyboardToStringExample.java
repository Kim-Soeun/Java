package sec01;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {

		byte[] bytes = new byte[100];
		
		System.out.println("�Է��ϼ��� : ");
		int readByteNo = System.in.read(bytes);
		// �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����
		
		String str = new String(bytes,0,readByteNo-2);
		// �迭�� ���ڷ� ��ȯ
		// readByteNo-2 : enter + �ٹٲ� ���� ���ԵǱ� ������ �������� ���� 
		System.out.println(str);
	}

}
