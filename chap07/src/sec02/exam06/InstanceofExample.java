package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {

		Parent parentA = new Child(); // 자식을 부모클래스로 자동변환 -> 부모를 자식 타입으로 강제변환 가능
		method1(parentA);
		
		Parent parentB = new Parent(); // 자식을 부모클래스로 자동변환 x -> 부모를 자식 타입으로 강제변환 x
		method1(parentB);
	}

	public static void method1(Parent parent) {
		
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("강제 변환 성공");
		} else {
			System.out.println("강제 변환 실패");
		}
		}
	
}
