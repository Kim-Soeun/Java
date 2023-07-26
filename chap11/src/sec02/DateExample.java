package sec02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		// Date 클래스는 바로 new 객체 생성 가능
		// Calendar 클래스는 바로 new 객체 생성 불가능
		
		Date now = new Date();  			// import 해주기
		String strNow1 = now.toString();
		System.out.println(strNow1);  		// 영문으로 된 날짜 리턴
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);   // format() 메소드 호출해서 원하는 형식의 날짜 정보 얻을 수 있음
		System.out.println(strNow2);
		
		
		
	}

}
