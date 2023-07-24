package sec01;

public class MyPointExample {

	public static void main(String[] args) {

		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		// System.out.println에 클래스 p를 넣으면
		// toString 값이 나옴
		// 오버라이드 하지 않았으면 해쉬코드 값이 나오지만
		// 오버라이드 했기 때문에 재정의한 문자열이 값으로 출력됨
		
		if(p.equals(q))
			// 매개변수 obj에 q를 대입해서 비교함
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
		
	}

}
