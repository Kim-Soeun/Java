package sec02;

public class 확인문제1 {

	public static void main(String[] args) {

//		byte b = 5; -> x   int b = 5; -> o
//		b = -b             b = -b
		
		byte b = 5;
		b = (byte)-b;
//		c = Byte.parseByte(b); 문자열을 숫자로 바꾸는 기능이기 때문에 적용 안 됨 
		int result = 10 / b;
		System.out.println(result);
		
	}

}
