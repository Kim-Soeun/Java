package sec03;

public class 생성자연습문제 {

	public static void main(String[] args) {
		
//		1. 기본 생성자로 객체를 생성한 후 이름과 나이 출력
//		2. 매개변수 2개 생성자로 객체 생성한 후
//		이름은 홍수아 나이는 30으로 설정 후 출력
//		3. 매개변수 3개 생성자로 객체 생성한 후
//		이름은 홍길동 학번은 20231111 연락처 010-5555-7777 설정후 출력
		
		Student student1  = new Student();
		System.out.println("이름 : " + student1.name);
		System.out.println("나이 : " + student1.age);
		
		Student student2 = new Student("홍수아", 30);
		System.out.println("이름 : " + student2.name);
		System.out.println("나이 : " + student2.age);
		
		Student student3 = new Student("홍길동", "20231111", "010-5555-7777");
		System.out.println("이름 : " + student3.name);
		System.out.println("나이 : " + student3.deptNum);
		System.out.println("나이 : " + student3.phone);
		
		
	}

}
