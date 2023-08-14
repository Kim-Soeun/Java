package sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputExample {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("c:/temp/test2/db");
		// test2 ���Ͽ� ����� ������ ����
		// ������ �б� ���� InputStream ��ü�� �����ϰ�
		// �ش� ��ü�� "c:/temp/test2/db" ��ο� ����
		// FileInputStream : ������ ����Ʈ ������ ���� �� �ִ� ��Ʈ��
		
		
		byte[] buffer = new byte[100];
		// ���̰� 100�� �迭�� ����
		// read(byte[] b) �޼ҵ�� �Ѳ����� 100����Ʈ �а� �迭�� ����
		// ���Ͽ� ���� ����Ʈ�� 100�� �̻� �������� ���, 100����Ʈ �Ѳ����� ����
		// �׷��� �ʴٸ� ���� �� �ִ� ����Ʈ ����ŭ�� ����
		// ���� ���� ����Ʈ ���� �� read(byte[] b) ����ϴ� ���� ����
		// read()�� 100�� �ݺ��ؼ� �б� ������ �ӵ��� ������ read(byte[] b)�� �� ����
		
		
		while(true) {
			int readByteNum = is.read(buffer);
			// read() : �Է� ��Ʈ�����κ��� 1byte�� �а� int(4byte) Ÿ������ ����
			// is InputStream ��ü�� ���� buffer�� �ִ� 100����Ʈ ũ���� �����͸� �о��
			// readByteNum�� ������ �о�� ����Ʈ ���� �����
			
			if(readByteNum==-1) break;
			// �� �̻� �Է½�Ʈ�����κ��� ����Ʈ�� ���� �� ���ٸ� read() �޼ҵ�� -1�� ������
			// �׷��� -1�̸� ���� ���� ������ ���� ����Ʈ�� ���ٴ� �ǹ��̹Ƿ� while�� ����
			
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
				// ���� ����Ʈ ����ŭ �ݺ��ϸ鼭 �迭�� ����� ����Ʈ ���
			}
				
		}
		
		is.close(); 	// ��� ��Ʈ�� �ݱ�
	}

}
