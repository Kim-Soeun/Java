package sec02;


public class StudentExample {

	public static void main(String[] args) {

		// 중첩 클래스(StudentB) 객체 생성하세요

		StudentA sta = new StudentA();
		StudentA.StudentB stb = sta.new StudentB();

		stb.name = "홍길동";
		stb.age = 21;
		stb.sleep();

		// 익명객체(Person)의 메소드 호출
		sta.person.wake();
		sta.method1();
		// sta.person.work();
		// 오버라이드 안된 메소드를 직접 호출 x

		// method2는 매개변수로 Person 클래스 타입을 넘겨줘야 함
		// 매개변수는 마지막에 ; 사용안함
		sta.method2(new Person() {
			void study() {
				System.out.println("공부합니다");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다");
				study();
				// 오버라이드 안된 메소드는 바로 호출 안되기 때문에
				// 이중으로 메소드를 호출함
			}

		}

		);

	}

}
