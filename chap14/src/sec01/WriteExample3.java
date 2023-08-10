package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/name.txt");
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String str = s.next();
		
		byte[] data = str.getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		
		os.flush();
		os.close();
	}

}
