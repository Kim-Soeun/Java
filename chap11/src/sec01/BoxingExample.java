package sec01;

public class BoxingExample {

	public static void main(String[] args) {

		// Wrapper 클래스 박싱(포장)
		Integer obj1 = new Integer(100);		// 매개값 : 기본타입
		Integer obj2 = new Integer("100");		// 매개값 : 문자열
		Integer obj3 = Integer.valueOf("300");	// 생성자 이용 x, 포장 클래스에 있는 정적 메소드 valueOf() 사용
		
		// Wrapper 클래스 언박싱(포장 해제)
		int value1 = obj1.intValue();			// 다시 기본타입 얻기 위해 언박싱
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
//		Integer obj4 = 100;						// 자동 박싱
//		int value4 = obj4;						// 자동 언박싱
//		Integer obj5 = "100";					// int, String 타입이 달라서 자동 박싱 안됨

		
		// 포장 객체 비교
		Integer obj4 = new Integer(100);
		Integer obj5 = new Integer(100);
		System.out.println(obj4==obj5);  		// false(포장 클래스 비교)
		
		int num1 = 100;
		int num2 = 100;
		System.out.println(num1==num2);  		// true(숫자 비교)
		
		
		if(obj4==obj5) {
			System.out.println("true");			// false
		} else {
			System.out.println("false");
		}
		
	}

}
