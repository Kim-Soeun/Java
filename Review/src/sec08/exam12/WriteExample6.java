package sec08.exam12;

import java.io.*;
import java.util.*;

public class WriteExample6 {

	public static void main(String[] args) throws Exception {

		// ��ĳ�� ���� ����ڿ��� �ּ� �Է¹ޱ�
		// ��) ���� �ϱ�, ���� ����
		
		OutputStream os = new FileOutputStream("c:/temp/review5.txt");
		DataOutputStream dos = new DataOutputStream(os);
		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		String address = s.nextLine();
		
		dos.writeUTF(address);
		dos.flush();
		dos.close();
	}

}
