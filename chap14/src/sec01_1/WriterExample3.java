package sec01_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class WriterExample3 {

	public static void main(String[] args) throws Exception {

		// 스캐너 이용해서 주소를 입력 받으세요
		// 예) 광주광역시 서구 광천동
		// Writer 이용해서 address3.txt 파일로 저장하고
		// Reader 이용해서 address3.txt 파일에서 동 정보만 파악해서 콘솔창에 출력
		// 예) 광주광역시
		
		
		// 입력받은 주소 Writer 이용해 파일에 저장
		Writer writer = new FileWriter("c:/temp/address3.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		
		String address = s.nextLine();
		
		writer.write(address);
		
		writer.flush();
		writer.close();
		
		
		
		// 파일에 저장된 주소 콘솔창에 출력
		Reader reader = new FileReader("c:/temp/address3.txt");
		
		char[] buffer = new char[5];
		int readNum = reader.read(buffer,0,5);  
		// 인덱스 0번부터 5개의 문자를 읽어와 buffer 배열에 저장
		if(readNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.print(buffer[i]);
			}
		}
		reader.close();
	}

}
