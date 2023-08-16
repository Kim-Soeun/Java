package sec01_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class WriterExample3 {

	public static void main(String[] args) throws Exception {

		// ��ĳ�� �̿��ؼ� �ּҸ� �Է� ��������
		// ��) ���ֱ����� ���� ��õ��
		// Writer �̿��ؼ� address3.txt ���Ϸ� �����ϰ�
		// Reader �̿��ؼ� address3.txt ���Ͽ��� �� ������ �ľ��ؼ� �ܼ�â�� ���
		// ��) ���ֱ�����
		
		
		// �Է¹��� �ּ� Writer �̿��� ���Ͽ� ����
		Writer writer = new FileWriter("c:/temp/address3.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		
		String address = s.nextLine();
		
		writer.write(address);
		
		writer.flush();
		writer.close();
		
		
		
		// ���Ͽ� ����� �ּ� �ܼ�â�� ���
		Reader reader = new FileReader("c:/temp/address3.txt");
		
		char[] buffer = new char[5];
		int readNum = reader.read(buffer,0,5);  
		// �ε��� 0������ 5���� ���ڸ� �о�� buffer �迭�� ����
		if(readNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.print(buffer[i]);
			}
		}
		reader.close();
	}

}
