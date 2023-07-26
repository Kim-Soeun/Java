package sec01;

public class BoxingExample2 {

	public static void main(String[] args) {
		
		
		// 박싱은 포장 클래스의 객체를 만드는 것
		// 매개값으로 기본타입 or 문자열 대입 가능
		// but, 매개값으로 "가나" 대입하면 예외발생
		// String "가나"을 int로 바꿀 수 없기 때문
		

		// Integer obj1 = new integer(100);    // 정식 박싱 코드
		// 대입값이 int 타입이면 자동으로 박싱해줌
		Integer obj = 100;
		System.out.println(obj);
		
		// int value = obj.intValue();			// 정식 언박싱 코드
		// 대입값이 int 타입이면 자동으로 언박싱해줌
		int value = obj;
		System.out.println(value);
		
		// 질문!!    
		Integer obj2 = new Integer("100");		// 숫자 100이 들어감
		// int value2 = Integer.parseInt(obj2);
		// Integer.parseInt는 String 타입을 Int 타입으로 변경
		// obj2의 값이 String이 아니기 때문에 사용 불가능 
		int value2 = Integer.valueOf(obj2);		
		// obj2의 타입이 int wrapper 클래스이기 때문에 valueOf 사용 
		
		
		int value3 = Integer.parseInt("300");	// "300" String 매개값을 int로 변환
		System.out.println(value3);  			// 300 출력(int)
		byte value4 = Byte.parseByte("10");		// "10" String 매개값을 byte로 변환
		System.out.println(value4);				// 10 출력(byte)
		
	}

}
