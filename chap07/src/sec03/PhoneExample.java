package sec03;

public class PhoneExample {

	public static void main(String[] args) {

//		Phone phone = new Phone("홍길동");	
//		추상 클래스는 직접 객체 생성 x
		
		SmartPhone smartphone = new SmartPhone("홍길동", 1200000);
//		자식 클래스의 객체 생성 o
		smartphone.turnOn();	// 추상클래스의 메소드
		smartphone.internerSearch();	// 객체 메소드
		
		
	}

}
