package sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("c:/temp/test3.db");
		// test3에 저장되어 있는 내용 : 20, 30, 40
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer,2,3);
		// test3 파일에서 3바이트를 읽고
		// 길이가 5인 buffer 배열의 배열[2],[3],[4]에 저장
		
		if(readByteNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
		
		// 실행결과 : 0 0 20 30 40 
		
	}

}
