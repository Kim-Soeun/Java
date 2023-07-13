package sec02.verify.exam02;

public class SnowTire extends Tire {

	String model;
	int weight;
	
	public SnowTire(String company, int cost, String model) {
		super(company, cost);
		this.model = model;
	}

	@Override  // 오버라이딩 표식, 안써도 오버라이딩 되어짐
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다");
	}
	
	public void rotate() {
		System.out.println("스노우 타이어가 회전합니다");
	}
	
}
