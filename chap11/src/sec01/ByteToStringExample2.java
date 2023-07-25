package sec01;

public class ByteToStringExample2 {

	public static void main(String[] args) {

		byte[] bytes = {71, 111, 111, 100, 32, 109, 111, 114, 110, 105, 110, 103};	
		//  코드표 이용
		String str1 = new String(bytes);
		// 바이트 배열을 문자열로 변환
		
		System.out.println(str1);
		
		String str2 = new String(bytes,5,7);
		// 인덱스 5번부터 7글자 추출
		System.out.println(str2);
	}

}
