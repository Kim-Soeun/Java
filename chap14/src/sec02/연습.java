package sec02;

import java.io.*;
import java.util.*;

public class ���� {

	public static void main(String[] args) throws Exception {

		// ��ĳ�ʸ� �̿�
		// ��ȭ��ȣ�� �Է¹޾� c:/temp/phone.txt ���Ϸ� �����ϼ���
		// ex) 010 8855 8779
		// ����ڰ� �׸��� ������ �Է� ��������
		// bufferedReader �� �̿��Ͽ� �ܼ�â�� �Էµ� ��ȭ��ȣ�� ����ϼ���
		
		Scanner s = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("c:/temp/phone.txt");
		Writer w = new OutputStreamWriter(fos);
		
		while(true) {
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			String tel = s.nextLine();
			
			if(tel.equals("�׸�")) break;
			w.write(tel + "\n");
		}
		w.flush();
		w.close();
		
		
		
		Reader reader = new FileReader("c:/temp/phone.txt");
	
		BufferedReader br = new BufferedReader(reader);
		// ������Ʈ�� ����
		
		while(true) {
			String data = br.readLine();
			if(data==null) break;
			System.out.println(data);
		}
		br.close();
		
	}

}
