package sec08.exam14;

import java.util.*;

public class CarExample {

	public static void main(String[] args) {

		// 1번 데이터 추가
		// 사용자로부터 데이터 입력 받아 자동차 클래스 객체를 생성하여
		// 리스트에 추가하세요

		// 2번 데이터 삭제
		// 사용자로부터 인덱스 번호를 입력받아 리스트 데이터를 삭제하세요

		// 3번 데이터 출력
		// 입력된 리스트 데이터를 모두 출력하세요

		// 4번 종료

		List<Car> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("1번 데이터 추가, 2번 데이터 삭제, 3번 데이터 출력, 4번 종료");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("제조회사를 입력하세요");
				String company = s.next();
				System.out.println("가격을 입력하세요");
				int cost = s.nextInt();
				System.out.println("최고속도를 입력하세요");
				int maxSpeed = s.nextInt();
				System.out.println("색상을 입력하세요");
				String color = s.next();
				list.add(new Car(company, cost, maxSpeed, color));
				break;
			case 2:
				System.out.println("삭제할 인덱스를 입력하세요");
				list.remove(s.nextInt());
				break;
			case 3:
				for (int i = 0; i < list.size(); i++) {
					Car car = list.get(i);
					System.out.println(car.company + "\t" + car.cost + "\t" + car.maxSpeed + "\t" + car.color);
				}
				break;
			case 4:
				System.out.println("종료합니다");
				run = false;
			}
		}
	}

}
