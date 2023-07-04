package sec03;

import java.util.Calendar;

public class 열거형예제2 {

	public static void main(String[] args) {

//		열거형 Part (일사분기, 이사분기, 삼사분기, 사사분기)
//		Calendar 현재 월정보
//		현재 월은 삼사분기 입니다 출력
		
		Part now = null;
		
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH)+1;
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			now = Part.일사분기;
			break;
		case 4:
		case 5:
		case 6:
			now = Part.이사분기;
			break;
		case 7:
		case 8:
		case 9:
			now = Part.삼사분기;
			break;
		case 10:
		case 11:
		case 12:
			now = Part.사사분기;
			break;
			
		}
			System.out.println("현재 월은 " + now + "입니다");
	}

}
