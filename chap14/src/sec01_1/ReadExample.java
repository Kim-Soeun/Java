package sec01_1;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("c:/temp/test7.txt");
		// �Է� ��Ʈ�����κ��� �� ���� ����(2����Ʈ)�� �а� intŸ��(4����Ʈ)�� ����
		// ���ϵ� 4����Ʈ �� ���� �ִ� 2����Ʈ�� ���� �����Ͱ� ��� ����
		
		while(true) {
			int data = reader.read();
			if(data==-1) break;
			// ���̻� �Է� ��Ʈ�����κ��� ���ڸ� ���� �� ������ -1�� ����
				System.out.println((char)data);
				// read �޼ҵ尡 ������ int���� char Ÿ������ ��ȯ�ؾ� ���ڷ� ���� �� ����
				
		}
		
		reader.close();
	}

}
