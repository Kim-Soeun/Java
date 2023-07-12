package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {

		Truck truck = new Truck("흰색", "벤츠", 3, "중");
		
		Car car = truck;		// 클래스 자동 타입 변환
		
		car.speedUp(30);		// 부모 메소드 호출
//		car.maxSpeed(50);		// 타입이 변환되었기 때문에 자식 메소드 호출 x
		
		car.start();			//자식 메소드이지만 오버라이딩 했기 때문에 호출 가능
		
	}

}
