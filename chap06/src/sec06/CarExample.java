package sec06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean run = true;
		
		Car car = new Car();
		
		while(run) {
			System.out.println("1은 색상 변경, 2는 속도변경, 3은 중단");
			int choice = s.nextInt();

			switch(choice) {
			case 1 :
				car.setCarColor();
				break;
			case 2 :
				car.setCarSpeed();
				break;
			case 3 :
				run = false;
				break;
			default :
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}

}
