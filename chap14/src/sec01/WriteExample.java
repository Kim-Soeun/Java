package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/test1.db");
		// FileOutputStream os = new FileOutputStream("c:/temp/test1.db"); 이렇게도 가능
		
		// db로 저장시 글자형태가 아니기 때문에 글로 읽을 수 없음
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();			// 모든 바이트를 출력
		os.close();			// 출력 스트림 닫기
		
	}

}
