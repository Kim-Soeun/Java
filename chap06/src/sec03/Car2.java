package sec03;

public class Car2 {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	public Car2() {		// �⺻ ������
		
	}
	
	public Car2(String model) {		
		this(model, "����, 250");
	}
	
	public Car2(String model, String color) {		
		// �𵨸�� �ӵ��� ���� ������ ����
		// �����ڰ� �ϳ� �����Ƿ� ��ǻ�Ͱ� �ڵ����� �������� ����
		this(model,color,250);
	}
	
	public Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
