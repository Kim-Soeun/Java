package sec01;

public class ByteToStringExample2 {

	public static void main(String[] args) {

		byte[] bytes = {71, 111, 111, 100, 32, 109, 111, 114, 110, 105, 110, 103};	
		//  �ڵ�ǥ �̿�
		String str1 = new String(bytes);
		// ����Ʈ �迭�� ���ڿ��� ��ȯ
		
		System.out.println(str1);
		
		String str2 = new String(bytes,5,7);
		// �ε��� 5������ 7���� ����
		System.out.println(str2);
	}

}
