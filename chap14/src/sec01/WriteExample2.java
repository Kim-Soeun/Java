package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		// 파일을 쓰기 위한 OutputStream 객체를 생성하는 부분
		// "c:/temp/test.txt"는 파일의 경로와 이름을 나타내며, 
		// 이 코드는 "c:/temp" 디렉토리에 "test.txt"라는 파일을 생성하거나 덮어씀
		// FileOutputStream : byte 단위로 데이터를 파일에 쓸 수 있는 클래스
		
		
		byte[] data = "ABC".getBytes();
		// "ABC" 문자열을 바이트 배열로 변환하여 data 변수에 저장
		// getBytes() :  문자열을 바이트 배열로 변환하는 메서드
		// 이 경우 "ABC" 문자열을 ASCII 인코딩을 통해 바이트 배열로 변환
		
		for(int i=0; i<data.length; i++) {
		// data 배열의 각 바이트를 순회하면서 파일에 바이트를 쓰는 루프
			os.write(data[i]);
			// os OutputStream 객체를 통해 바이트를 파일에 쓰는 동작을 수행
		}
		
		os.flush(); 
		os.close(); // 출력 스트림 닫음, OutputStream을 더 이상 사용하지 않겠다는 의미
	}

}
