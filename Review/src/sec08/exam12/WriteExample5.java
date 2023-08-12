package sec08.exam12;

import java.io.*;
import java.util.*;

public class WriteExample5 {

	public static void main(String[] args) throws Exception {

		// 스캐너 통해 사용자에게 주소 입력받기
		// 예) 광주 북구, 광주 남구
		// 예) 북구, 남구 출력
				
		OutputStream os = new FileOutputStream("c:/temp/review4.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String address = s.nextLine();
		
		byte[] data = address.getBytes();
		
		os.write(data, 5, 4);
		os.flush();
		os.close();
		
		
	}

}
