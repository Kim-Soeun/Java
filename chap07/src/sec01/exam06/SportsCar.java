package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() { speed += 10; }

//	@Override						
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
//	      -> 오버라이딩 안됨(메소드 stop을 final로 지정했기 때문에)
	
	
	public void stop(int x) {
		// 리턴값이나 매개변수를 변경하면 메소드 오버라이드 x
		System.out.println("스포츠카를 멈춤");
		speed=0;
	}
}
