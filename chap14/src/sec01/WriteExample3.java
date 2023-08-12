package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {

		
		// 스캐너 이용해 이름을 입력받아 
		// 파일에 이름 출력하기
		
		OutputStream os = new FileOutputStream("c:/temp/name.txt");
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = s.next();
		
		byte[] data = name.getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		
		os.flush();
		os.close();
	}

}
