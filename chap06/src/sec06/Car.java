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
		System.out.println("�ڵ��� ������ �Է��� �ּ���");
		String changeColor = s.next();
		CarColor = changeColor;
		System.out.println("�ڵ��� ���� : " + getCarColor());
	}

	public int getCarSpeed() {
		return CarSpeed;
	}

	public void setCarSpeed() {
		System.out.println("Ű�� �����ּ��� a�� �ӵ�����, s�� �ӵ�����");
		String key = s.next();
		System.out.println("�ӵ��� �Է��� �ּ���");
		int changeSpeed = s.nextInt();
		int presentSpeed = getCarSpeed();
		
		if (key.equals("s") && presentSpeed < changeSpeed) {
			System.out.println("�ӵ��� ���̳ʽ��� �� �� �����ϴ�");
		} else if (key.equals("s") && presentSpeed >= changeSpeed) {
			CarSpeed -= changeSpeed;
			System.out.println("���� �ӵ� : " + getCarSpeed());
		} else {
			CarSpeed += changeSpeed;
			System.out.println("���� �ӵ� : " + getCarSpeed());
		}
	}
}
