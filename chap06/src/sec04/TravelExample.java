package sec04;

import java.util.Scanner;

public class TravelExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		Travel tr = new Travel();
		
		tr.setOil(20);
		tr.setLocation("����");
		
		while (tr.isLeftOil()) {
			System.out.println("������ �Է��ϼ���");
			String area = s.next();
			if (area.equals("����")) {
				tr.setLocation("����");
				tr.oilMinus(10);
				System.out.println("���� ��ġ�� : " + tr.getLocation());
			}	else if (area.equals("�λ�")) {
				tr.setLocation("�λ�");
				tr.oilMinus(5);
				System.out.println("���� ��ġ�� : " + tr.getLocation());
			}	else {
				tr.setLocation("ȭ��");
				tr.oilMinus(2);
				System.out.println("���� ��ġ�� : " + tr.getLocation());
				
			}
		}
		
	}

}
