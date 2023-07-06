package sec04;

import java.util.Scanner;

public class TravelExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		Travel tr = new Travel();
		
		tr.setOil(20);
		tr.setLocation("광주");
		
		while (tr.isLeftOil()) {
			System.out.println("지역을 입력하세요");
			String area = s.next();
			if (area.equals("서울")) {
				tr.setLocation("서울");
				tr.oilMinus(10);
				System.out.println("현재 위치는 : " + tr.getLocation());
			}	else if (area.equals("부산")) {
				tr.setLocation("부산");
				tr.oilMinus(5);
				System.out.println("현재 위치는 : " + tr.getLocation());
			}	else {
				tr.setLocation("화순");
				tr.oilMinus(2);
				System.out.println("현재 위치는 : " + tr.getLocation());
				
			}
		}
		
	}

}
