package sec03;

public class Car2 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car2() {
		
	}

	public Car2(String model) {
		this(model, "은색", 250);
	}

	public Car2(String model, String color) {
		this(model, color, 250);
	}

	public Car2(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	
	
}
