package sec01_1;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("c:/temp/address2.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		
		String str = s.nextLine();
		
		writer.write(str,6,2);  // 6�� �ε��� ���ں��� 2�� ���
		
		writer.flush();
		writer.close();
		
		
	}

}
