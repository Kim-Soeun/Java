package sec08.exam12;

import java.io.*;

public class WriteExample4 {

	public static void main(String[] args) throws Exception {

		
		OutputStream os = new FileOutputStream("c:/temp/review3.txt");
		
		byte[] data = "ABC".getBytes();
		os.write(data);
		os.flush();
		os.close();
		
		
		
	}

}
