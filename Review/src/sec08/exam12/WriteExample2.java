package sec08.exam12;

import java.io.*;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/review.txt");
		
		byte[] bytes = "ABC".getBytes();
		
		for(int i=0; i<bytes.length; i++) {
			os.write(bytes[i]);
		}
		
		
		os.flush();
		os.close();
		
		// ���Ͽ� ABC ���
	}

}
