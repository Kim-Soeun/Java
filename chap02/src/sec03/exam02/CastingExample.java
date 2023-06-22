package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 10;
		byte byteValue = (byte)intValue;
		
		System.out.println(byteValue);
		
		int a = 44032;
		char charValue = (char) a; //강제 타입 변환
		System.out.println(charValue); // '가' 출력
		
		double doubleValue = 3.14;
		int b = (int) doubleValue;
		System.out.println(b); // 정수인 3만 출력
	}

}
