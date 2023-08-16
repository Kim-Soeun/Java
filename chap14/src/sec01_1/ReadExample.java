package sec01_1;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("c:/temp/test7.txt");
		// 입력 스트림으로부터 한 개의 문자(2바이트)를 읽고 int타입(4바이트)로 리턴
		// 리턴된 4바이트 중 끝에 있는 2바이트에 문자 데이터가 들어 있음
		
		while(true) {
			int data = reader.read();
			if(data==-1) break;
			// 더이상 입력 스트림으로부터 문자를 읽을 수 없으면 -1을 리턴
				System.out.println((char)data);
				// read 메소드가 리턴한 int값을 char 타입으로 변환해야 문자로 읽을 수 있음
				
		}
		
		reader.close();
	}

}
