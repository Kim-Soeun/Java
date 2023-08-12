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
		// DataOutputStream : 기본 타입(Char, Double, int 등)의 데이터를 읽고 쓸 수 있음, 보조 스트림
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String address = s.nextLine();
		
		dos.writeUTF(address);
		// 보조스트림 DataOutputStream을 사용하기 때문에 
		// 입력받은 String을 byte로 바꾸지 않아도 됨
		// writeUTF 이용해 바로 파일에 String으로 출력 가능
		
		
		dos.flush();
		dos.close();
		
		
		
		
		
		
	}

}
