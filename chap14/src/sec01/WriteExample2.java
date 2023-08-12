package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		// ������ ���� ���� OutputStream ��ü�� �����ϴ� �κ�
		// "c:/temp/test.txt"�� ������ ��ο� �̸��� ��Ÿ����, 
		// �� �ڵ�� "c:/temp" ���丮�� "test.txt"��� ������ �����ϰų� ���
		// FileOutputStream : byte ������ �����͸� ���Ͽ� �� �� �ִ� Ŭ����
		
		
		byte[] data = "ABC".getBytes();
		// "ABC" ���ڿ��� ����Ʈ �迭�� ��ȯ�Ͽ� data ������ ����
		// getBytes() :  ���ڿ��� ����Ʈ �迭�� ��ȯ�ϴ� �޼���
		// �� ��� "ABC" ���ڿ��� ASCII ���ڵ��� ���� ����Ʈ �迭�� ��ȯ
		
		for(int i=0; i<data.length; i++) {
		// data �迭�� �� ����Ʈ�� ��ȸ�ϸ鼭 ���Ͽ� ����Ʈ�� ���� ����
			os.write(data[i]);
			// os OutputStream ��ü�� ���� ����Ʈ�� ���Ͽ� ���� ������ ����
		}
		
		os.flush(); 
		os.close(); // ��� ��Ʈ�� ����, OutputStream�� �� �̻� ������� �ʰڴٴ� �ǹ�
	}

}
