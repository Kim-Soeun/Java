package sec01.exam01;

public class SportCar implements Car {

	int speed;

	public void speedUp(int speed) {
		if (speed>Car.MAX_SPEED) {
			this.speed = Car.MAX_SPEED; 
		} else {
			this.speed = speed;
		}
		System.out.println("SportCar ���� �ӵ� : " + this.speed);
	}

	public void speedDown(int speed) {
		if (speed<Car.MIN_SPEED) {
			this.speed = Car.MIN_SPEED; 
		} else {
			this.speed = speed;
		}
		System.out.println("SportCar ���� �ӵ� : " + this.speed);
	}
	
}
