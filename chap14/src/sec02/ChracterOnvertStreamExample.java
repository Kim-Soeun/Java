package sec02;

import java.io.*;

public class ChracterOnvertStreamExample {

	public static void main(String[] args) throws Exception {

		write("문자 변환 스트림을 사용합니다");   
		// 메소드(매개변수 : 문자열)
		
		String data = read();
		// read() -> 메소드, 매개변수 x, 리턴타입 String
		
		System.out.println(data);
		
		
		
	}
	
	public static void write(String str)  throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		// FileOutputStream에 OutputStreamWriter 보조 스트림을 연결
		
		writer.write(str);
		writer.flush();
		// 보조 스트림 이용해서 문자 출력
		writer.close();
	}

	public static String read() throws Exception {
		
		FileInputStream fis = new FileInputStream("c:/temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer,0,readCharNum);
		// char 배열에서 읽은 수만큼 문자열로 변환
		return data;
		
	}
	
	
	
}
