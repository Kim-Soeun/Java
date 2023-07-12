package sec01;

public class StudentExample {

	public static void main(String[] args) {

//		Student 객체 생성(매개변수 3개)
//		자기 메소드 1개 호출
//		부모 메소드 2개 호출  -> 결과 확인
		
		Student student = new Student(50, 165, 12345);
		
		student.study("도서관");		// 자기 메소드 호출
		
		String result1 = student.eat("샌드위치");  // 오버라이드 메소드
		System.out.println(result1);
		String result2 = student.run(20);		// 부모 메소드 2개 호출
		System.out.println(result2);
		
		
	}

}
