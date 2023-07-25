package sec01;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String str = "안녕하세요";
		byte[] byte1 = str.getBytes();
		// 기본문자셋에서 알파벳은 1바이트, 한글은 2바이트로 변환
		System.out.println(byte1.length); // 10
		
		byte[] byte2 = str.getBytes("UTF-8");
		// UTF-8에서 알파벳은 1바이트, 한글은 3바이트로 변환 
		System.out.println(byte2.length); // 15
		
		
	}

}
