package sec08.exam12;

import java.io.*;
import java.util.*;

public class WriteExample5 {

	public static void main(String[] args) throws Exception {

		// ��ĳ�� ���� ����ڿ��� �ּ� �Է¹ޱ�
		// ��) ���� �ϱ�, ���� ����
		// ��) �ϱ�, ���� ���
				
		OutputStream os = new FileOutputStream("c:/temp/review4.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		String address = s.nextLine();
		
		byte[] data = address.getBytes();
		
		os.write(data, 5, 4);
		os.flush();
		os.close();
		
		
	}

}
