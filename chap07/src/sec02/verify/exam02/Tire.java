package sec02.verify.exam02;

public class Tire {

	
	String company;
	int cost;
	
	
	public Tire(String company, int cost) {
		this.company = company;
		this.cost = cost;
	}

	public void run() {
		System.out.println("일반 타이어가 굴러갑니다");
	}
	
	public void stop() {
		System.out.println("일반 타이어가 멈춥니다");
	}
	
	
	
}
