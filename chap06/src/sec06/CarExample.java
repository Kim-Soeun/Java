package sec06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean run = true;
		
		Car car = new Car();
		
		while(run) {
			System.out.println("1�� ���� ����, 2�� �ӵ�����, 3�� �ߴ�");
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		}
	}

}
