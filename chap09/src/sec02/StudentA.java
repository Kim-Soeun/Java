package sec02;

public class StudentA {

	
	// 익명 객체 생성
	Person person = new Person() {		
		void work() {
			System.out.println("등교합니다");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
		
	};
	
	// 중첩 클래스(인스턴스 멤버 클래스)
	class StudentB {
		String name;
		int age;
		
		void sleep() {
			System.out.println("잠을 잡니다");
		}
	}
	
	
	void method1() {
		// 메소드 내부 익명 객체
		Person localVar = new Person() {
		
			void walk() {
				System.out.println("산책합니다");
			}
			
			@Override
			void wake() {
				System.out.println("6시에 일어납니다");
				walk();
			}
			
		};
		localVar.wake();
		
	}
	
	
	void method2(Person person) {
		person.wake();
	}
}
