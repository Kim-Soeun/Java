package sec01;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car(); 					// 인스턴스 멤버 클래스 객체 생성 (new Car() : 생성자 호출)
		Car.OldCar oldcar = car.new OldCar();   // 상위 클래스 객체 먼저 생성
		car.cost = 5000;
		car.speedUp(30);
		
		oldcar.cost = 3000;
		oldcar.speedUp(50);
		
		System.out.println(car.cost);
		System.out.println(car.speed);
		System.out.println(oldcar.cost);
		System.out.println(oldcar.speed);
		
		
		Car.Truck truck = new Car.Truck(); // 정적 멤버 클래스 객체 생성
		truck.cost = 7000;				   // 바로 호출 가능	
		truck.speedUp(90);
		
		System.out.println(truck.cost);
		System.out.println(truck.speed);
		
		oldcar.carCall();
		truck.carCall();
	}

}
