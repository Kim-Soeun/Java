package sec01;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car(); 					// �ν��Ͻ� ��� Ŭ���� ��ü ���� (new Car() : ������ ȣ��)
		Car.OldCar oldcar = car.new OldCar();   // ���� Ŭ���� ��ü ���� ����
		car.cost = 5000;
		car.speedUp(30);
		
		oldcar.cost = 3000;
		oldcar.speedUp(50);
		
		System.out.println(car.cost);
		System.out.println(car.speed);
		System.out.println(oldcar.cost);
		System.out.println(oldcar.speed);
		
		
		Car.Truck truck = new Car.Truck(); // ���� ��� Ŭ���� ��ü ����
		truck.cost = 7000;				   // �ٷ� ȣ�� ����	
		truck.speedUp(90);
		
		System.out.println(truck.cost);
		System.out.println(truck.speed);
		
		oldcar.carCall();
		truck.carCall();
	}

}
