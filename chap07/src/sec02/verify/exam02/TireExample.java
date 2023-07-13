package sec02.verify.exam02;

public class TireExample {

	public static void main(String[] args) {

		SnowTire snowtire = new SnowTire("금호", 10, "TRX");
		Tire tire = snowtire;
		
		snowtire.rotate();
//		tire.rotate();	// 부모로 타입변환 했기 때문에 자식 메소드 호출 x
		tire.run();		// 부모 메소드 아닌 오버라이딩한 메소드 호출
		
	}

}
