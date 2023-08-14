package sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("c:/temp/test3.db");
		// test3�� ����Ǿ� �ִ� ���� : 20, 30, 40
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer,2,3);
		// test3 ���Ͽ��� 3����Ʈ�� �а�
		// ���̰� 5�� buffer �迭�� �迭[2],[3],[4]�� ����
		
		if(readByteNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
		
		// ������ : 0 0 20 30 40 
		
	}

}
