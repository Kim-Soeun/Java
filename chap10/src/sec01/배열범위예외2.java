package sec01;

public class 배열범위예외2 {

	public static void main(String[] args) {

		int num = 5;
		
		String b = String.valueOf(num);
		System.out.println(b);
		
		String c = Integer.toString(num);
		System.out.println(c);
		
		// valueOf, toString 모두 Object 타입의 값을 String으로 변환
		
		// 단, toString은 null처리 안됨
		// Object 담긴 값이 String 아니어도 출력
		
		// valueOf는 null 값 처리됨
		// Object 값이 String이 아니면 출력 안됨
		
	}

}
