package sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputExample2 {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("c:/temp/test1/db");
		
		
		while(true) {
			int data = is.read();
			// test1 파일에 저장된 내용 1바이트씩 읽음
			if(data==-1) break;
			System.out.println(data);
		}
		is.close(); 	// 출력 스트림 닫기
	}

}
