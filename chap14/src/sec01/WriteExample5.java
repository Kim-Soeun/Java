package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample5 {

	public static void main(String[] args) throws Exception {

		
		OutputStream os = new FileOutputStream("c:/temp/address.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String address = s.nextLine();
		
		
		byte[] data = address.getBytes();
		os.write(data, 5, 4);
		
		
		os.flush();
		os.close();
		
		
		
		
		
		
	}

}
