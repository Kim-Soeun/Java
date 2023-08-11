package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		
		byte[] data = "ABC".getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		
		os.flush();
		os.close(); // 출력 스트림 닫음, OutputStream을 더 이상 사용하지 않겠다는 의미
	}

}
