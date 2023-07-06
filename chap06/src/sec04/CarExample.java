package sec04;

public class CarExample {

	public static void main(String[] args) {
		
//		Car 클래스를 생성하세요
//		private 멤버변수 스피드 기본 100
//		시동걸기 powerOn  시동끄기 powerOff
//		속도증가 speedUp  속도감소  speedDown
//		멈춤  breakZero  메소드 생성
//		시동켜기 - 속도증가(30) - 속도증가(20) - 
//		속도감소(70) - 멈춤 - 시동끄기 
		
		

		Car car = new Car();
		car.powerOn();
		
		int result1 = car.speedUp(30);
		System.out.println("현재 속도는 : " + result1);
		
		int result2 = car.speedUp(20);
		System.out.println("현재 속도는 : " + result2);

		int result3 = car.speedDown(70);
		System.out.println("현재 속도는 : " + result3);
		
		int result4 = car.breakZero();
		System.out.println("현재 속도는 : " + result4);
		
		car.powerOff();
		
		
		
	}

}
