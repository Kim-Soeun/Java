package sec03;

public class Car2 {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	public Car2() {		// 기본 생성자
		
	}
	
	public Car2(String model) {		
		this(model, "빨강, 250");
	}
	
	public Car2(String model, String color) {		
		// 모델명과 속도가 들어가는 생성자 만듦
		// 생성자가 하나 있으므로 컴퓨터가 자동으로 만들지는 않음
		this(model,color,250);
	}
	
	public Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
