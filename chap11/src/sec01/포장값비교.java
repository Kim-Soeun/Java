package sec01;

public class 포장값비교 {

	public static void main(String[] args) {

		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("결과 : " + (obj1 == obj2));
		// false 출력
		System.out.println("언박싱후 결과 : " + (obj1.intValue() == obj2.intValue()));
		// true 출력
		
		
		// Integer num1 = new Integer(100)    :  정식 박싱 코드
		
		// 자동 박싱
		Integer num1 = 100;
		Integer num2 = 100;
		Integer num3 = 300;
		Integer num4 = 300;
		
		System.out.println(num1 == num2);		// true (byte 범위에서는 값으로 비교 가능)
		System.out.println(num3 == num4);       // false(byte 범위 밖에서는 값 비교 x)
		System.out.println(num3.equals(num4));  // true(그래서 그냥 포장클래스 값 비교할 때는 equals 쓰기) 
	}

}
