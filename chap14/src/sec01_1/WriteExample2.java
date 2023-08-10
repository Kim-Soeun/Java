package sec01_1;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("c:/temp/address2.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		
		String str = s.nextLine();
		
		writer.write(str,6,2);  // 6번 인덱스 글자부터 2개 출력
		
		writer.flush();
		writer.close();
		
		
	}

}
