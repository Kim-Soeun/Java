package sec01.exam01;

public class SportCar implements Car {

	int speed;

	public void speedUp(int speed) {
		if (speed>Car.MAX_SPEED) {
			this.speed = Car.MAX_SPEED; 
		} else {
			this.speed = speed;
		}
		System.out.println("SportCar 현재 속도 : " + this.speed);
	}

	public void speedDown(int speed) {
		if (speed<Car.MIN_SPEED) {
			this.speed = Car.MIN_SPEED; 
		} else {
			this.speed = speed;
		}
		System.out.println("SportCar 현재 속도 : " + this.speed);
	}
	
}
