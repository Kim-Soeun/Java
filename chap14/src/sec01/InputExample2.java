package sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputExample2 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("c:/temp/test1/db");
		
		
		while(true) {
			int data = is.read();
			// test1 ���Ͽ� ����� ���� 1����Ʈ�� ����
			if(data==-1) break;
			System.out.println(data);
		}
		is.close(); 	// ��� ��Ʈ�� �ݱ�
	}

}
