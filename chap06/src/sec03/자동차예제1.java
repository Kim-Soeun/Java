package sec03;

public class 자동차예제1 {

	public static void main(String[] args) {

		Car car = new Car(); 	// 기본 생성자 호출
		Car car2 = new Car("그랜저", 200); 	// 사용자 정의 생성자 호출
		System.out.println(car2.model);
		System.out.println(car2.speed);
	}

}
