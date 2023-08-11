package sec01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample6 {

	public static void main(String[] args) throws Exception {
		
		// 스캐너 통해 사용자에게 주소 입력받기
		// 예) 광주 북구, 광주 남구
		
		OutputStream os = new FileOutputStream("c:/temp/address4.txt");
		DataOutputStream dos = new DataOutputStream(os);
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String address = s.nextLine();
		
		dos.writeUTF(address);
		// 한 글자는 2바이트, 공백은 1바이트
		
		
		dos.flush();
		dos.close();
		
		
		
		
		
		
	}

}
