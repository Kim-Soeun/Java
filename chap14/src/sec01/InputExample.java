package sec01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputExample {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("c:/temp/test2/db");
		// test2 파일에 저장된 내용을 읽음
		// 파일을 읽기 위한 InputStream 객체를 생성하고
		// 해당 객체를 "c:/temp/test2/db" 경로에 연결
		// FileInputStream : 파일을 바이트 단위로 읽을 수 있는 스트림
		
		
		byte[] buffer = new byte[100];
		// 길이가 100인 배열을 생성
		// read(byte[] b) 메소드로 한꺼번에 100바이트 읽고 배열에 저장
		// 파일에 읽을 바이트가 100개 이상 남아있을 경우, 100바이트 한꺼번에 읽음
		// 그렇지 않다면 읽을 수 있는 바이트 수만큼만 읽음
		// 많은 양의 바이트 읽을 때 read(byte[] b) 사용하는 것이 좋음
		// read()는 100번 반복해서 읽기 때문에 속도가 느려서 read(byte[] b)가 더 빠름
		
		
		while(true) {
			int readByteNum = is.read(buffer);
			// read() : 입력 스트림으로부터 1byte를 읽고 int(4byte) 타입으로 리턴
			// is InputStream 객체를 통해 buffer에 최대 100바이트 크기의 데이터를 읽어옴
			// readByteNum에 실제로 읽어온 바이트 수가 저장됨
			
			if(readByteNum==-1) break;
			// 더 이상 입력스트림으로부터 바이트를 읽을 수 없다면 read() 메소드는 -1을 리턴함
			// 그래서 -1이면 파일 끝에 도달해 읽을 바이트가 없다는 의미이므로 while문 멈춤
			
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
				// 읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트 출력
			}
				
		}
		
		is.close(); 	// 출력 스트림 닫기
	}

}
