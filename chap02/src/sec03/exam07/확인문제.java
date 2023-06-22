package sec03.exam07;

public class 확인문제 {

	public static void main(String[] args) {

//		86p. 1번 문제
		int intValue = 10;
		char charVale = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		

//		2번 문제
		double var = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
//		char var4 = (char) strValue; 오답
//		char var4 = strValue.charAt(0); 문자열 - > 문자 : charAt 사용하기

		byte byteValue = 10;
		float floatValue = 2.5f;
		double doubleValue2 = 2.5;

//		3번문제
//		byte result = byteValue + byteValue; 
		int result = byteValue + byteValue;
		int result2 = 5 + byteValue;
		float result3 = 5 + floatValue;
		double result4 = 5 + doubleValue;

//		5번 문제
		char c1 = 'a';
		int c2 = c1 + 1;
		System.out.println((char) c2);

//		6번 문제
		int x = 5;
		int y = 2;
		double result5 = (double) x / y; //int result5 = x/y : 정수로 출력됨
		System.out.println(result5);
		
//		8번 문제
		double var5 = 3.5;
		double var6 = 2.7;
		int result6 = (int) (var5 +  var6); // double은 하나만 적어도 ok, int는 모두 적어줘야함
		System.out.println(result6);

	}

}
