package sec08.exam12;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/review1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
		
	}

}
