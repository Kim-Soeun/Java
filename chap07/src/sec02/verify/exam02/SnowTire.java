package sec02.verify.exam02;

public class SnowTire extends Tire {

	String model;
	int weight;
	
	public SnowTire(String company, int cost, String model) {
		super(company, cost);
		this.model = model;
	}

	@Override  // �������̵� ǥ��, �Ƚᵵ �������̵� �Ǿ���
	public void run() {
		System.out.println("����� Ÿ�̾ �������ϴ�");
	}
	
	public void rotate() {
		System.out.println("����� Ÿ�̾ ȸ���մϴ�");
	}
	
}
