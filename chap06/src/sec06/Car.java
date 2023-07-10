package sec06;

import java.util.Scanner;

public class Car {
	
	Scanner s = new Scanner(System.in);

	private String name;
	private String company;
	private String CarColor;
	private int CarSpeed = 50;

	public String getCarColor() {
		return CarColor;
	}

	public void setCarColor() {
		System.out.println("자동차 색상을 입력해 주세요");
		String changeColor = s.next();
		CarColor = changeColor;
		System.out.println("자동차 색상 : " + getCarColor());
	}

	public int getCarSpeed() {
		return CarSpeed;
	}

	public void setCarSpeed() {
		System.out.println("키를 눌러주세요 a는 속도증가, s는 속도감소");
		String key = s.next();
		System.out.println("속도를 입력해 주세요");
		int changeSpeed = s.nextInt();
		int presentSpeed = getCarSpeed();
		
		if (key.equals("s") && presentSpeed < changeSpeed) {
			System.out.println("속도는 마이너스가 될 수 없습니다");
		} else if (key.equals("s") && presentSpeed >= changeSpeed) {
			CarSpeed -= changeSpeed;
			System.out.println("현재 속도 : " + getCarSpeed());
		} else {
			CarSpeed += changeSpeed;
			System.out.println("현재 속도 : " + getCarSpeed());
		}
	}
}
