package sec04;

public class PrintfExample {

	public static void main(String[] args) {

//		printf("형식문자열", 값1, 2값) : 괄호안의 첫 번째 문자열 형식대로 내용 출력
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); // 상품의 가격:123원
		System.out.printf("상품의 가격:%6d원\n", value); // 상품의 가격:   123원

		int value2 = 1234;
		System.out.printf("상품의 가격:%d원\n", value2); // 상품의 가격:1234원
		System.out.printf("상품의 가격:%6d원\n", value2); // 상품의 가격:  1234원
		System.out.printf("상품의 가격:%-6d원\n", value2); // 상품의 가격:1234  원
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.3f\n",10,area); // 반지름이 10인 원의 넓이:   314.159

		String name = "홍길동";
		String job = "의적";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job); //      1 | 홍길동        |         의적

		System.out.printf("이름: %s",  "감자바"); // 이름: 감자바
		
	}



}
