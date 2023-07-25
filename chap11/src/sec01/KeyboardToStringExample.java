package sec01;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {

		byte[] bytes = new byte[100];
		
		System.out.println("입력하세요 : ");
		int readByteNo = System.in.read(bytes);
		// 배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		
		String str = new String(bytes,0,readByteNo-2);
		// 배열을 문자로 변환
		// readByteNo-2 : enter + 줄바꿈 까지 포함되기 때문에 갯수에서 빼줌 
		System.out.println(str);
	}

}
