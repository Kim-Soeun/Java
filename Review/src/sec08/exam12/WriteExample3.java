package sec08.exam12;

import java.io.*;
import java.util.*;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("c:/temp/name2.txt");
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = s.nextLine();
		
		byte[] bytes = name.getBytes();
		
		for(int i=0; i<bytes.length; i++) {
			os.write(bytes[i]);
		}
		
		os.flush();
		os.close();
	}

}
