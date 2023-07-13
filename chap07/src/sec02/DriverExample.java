package sec02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver(); //Driver 클래스 객체 생성
		Bus bus = new Bus();		  // Bus 클래스 객체 생성
		Taxi taxi = new Taxi();		  // Taxi 클래스 객체 생성
		
		bus.run();
		
//		driver.drive();            //drive 메소드는 매개변수가 있어야 함
		driver.drive(bus);		   // 클래스 타입의 매개변수 추가함
		// 자동 타입 변환 : Vehicle vehicle = bus;
		// bus가 들어가는 매개변수 자리는 원래 Vehicle vehicle 클래스 타입이었기 때문에
		// 그 자리에 들어간 bus는 그 클래스 타입으로 자동변환됨
		
		// 예) int sum = 0;
		// void sum(int x) {
		// sum += x;
		// }	
		// sum(5)  
		// 이 경우  매개변수 x 자리에 숫자 5가 들어가서 int x = 5 ;
		// 이렇듯 매개변수 자리에 들어가면 같은 것이 된다
		
		driver.drive(taxi);
		// 자동 타입 변환 : Vehicle vehicle = taxi;
		// "택시가 달립니다" 출력
		// 오버라이드 메소드를 출력하기 때문에 vehicle 아닌 taxi에 있는 run 메소드 출력
	}

}
