package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/test1.db");
		// ������ �������� test1.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		// FileOutputStream os = new FileOutputStream("c:/temp/test1.db"); �̷��Ե� ����
		// db�� ����� �������°� �ƴϱ� ������ ���Ͽ��� �۷� ���� �� ����
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();			// ��� ����Ʈ�� ���(���� ���ۿ� �ܷ��� ����Ʈ�� ��� ����ϴ� ����)
		os.close();			// ��� ��Ʈ�� �ݱ�
		
	}

}
