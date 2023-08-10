package sec01_1;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("c:/temp/test7.txt");
		
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
