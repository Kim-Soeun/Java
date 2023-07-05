package sec03;

public class 자동차예제2 {

	public static void main(String[] args) {

		Car car2 = new Car("BMW", 250); 	// 사용자 정의 생성자 호출
		System.out.println("모델명 : " + car2.model);
		System.out.println("속도 : " + car2.speed);
		System.out.println("제조회사 : " + car2.company);
		
		Car car3 = new Car("테슬라3", "빨간색", 350);
		System.out.println("모델명 : " + car3.model);
		System.out.println("색깔 : " + car3.color);
		System.out.println("속도 : " + car3.maxSpeed);
		
	}

}
