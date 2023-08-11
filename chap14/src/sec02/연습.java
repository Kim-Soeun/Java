package sec02;

import java.io.*;
import java.util.*;

public class 연습 {

	public static void main(String[] args) throws Exception {

		// 스캐너를 이용
		// 전화번호를 입력받아 c:/temp/phone.txt 파일로 저장하세요
		// ex) 010 8855 8779
		// 사용자가 그만할 때까지 입력 받으세요
		// bufferedReader 를 이용하여 콘솔창에 입력된 전화번호를 출력하세요
		
		Scanner s = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("c:/temp/phone.txt");
		Writer w = new OutputStreamWriter(fos);
		
		while(true) {
			System.out.println("전화번호를 입력하세요");
			String tel = s.nextLine();
			
			if(tel.equals("그만")) break;
			w.write(tel + "\n");
		}
		w.flush();
		w.close();
		
		
		
		Reader reader = new FileReader("c:/temp/phone.txt");
	
		BufferedReader br = new BufferedReader(reader);
		// 보조스트림 연결
		
		while(true) {
			String data = br.readLine();
			if(data==null) break;
			System.out.println(data);
		}
		br.close();
		
	}

}
