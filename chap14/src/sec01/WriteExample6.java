package sec01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample6 {

	public static void main(String[] args) throws Exception {
		
		// ��ĳ�� ���� ����ڿ��� �ּ� �Է¹ޱ�
		// ��) ���� �ϱ�, ���� ����
		
		OutputStream os = new FileOutputStream("c:/temp/address4.txt");
		DataOutputStream dos = new DataOutputStream(os);
		// DataOutputStream : �⺻ Ÿ��(Char, Double, int ��)�� �����͸� �а� �� �� ����, ���� ��Ʈ��
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		String address = s.nextLine();
		
		dos.writeUTF(address);
		// ������Ʈ�� DataOutputStream�� ����ϱ� ������ 
		// �Է¹��� String�� byte�� �ٲ��� �ʾƵ� ��
		// writeUTF �̿��� �ٷ� ���Ͽ� String���� ��� ����
		
		
		dos.flush();
		dos.close();
		
		
		
		
		
		
	}

}
