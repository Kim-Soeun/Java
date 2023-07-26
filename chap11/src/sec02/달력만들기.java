package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class 달력만들기 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = s.nextInt();
		System.out.println("월을 입력하세요");
		int month = s.nextInt();
		
		Calendar start = Calendar.getInstance(); // start는 로딩한 시점의 날짜 정보 가져옴
		Calendar end = Calendar.getInstance();   // end도 로딩한 시점의 날짜 정보 가져옴
		
		start.set(year, month-1, 1);
		// 시작 월 세팅, month-1  해줘야 정확한 월을 인식함, 날짜는 1일로 세팅
		end.set(year, month, 1);
		// 끝나는 월 세팅, 입력한 다음달의 1일로 세팅하고
		end.add(Calendar.DATE, -1);
		// 마지막 날짜를 입력한 달에서 1을 뺀 날짜로 세팅
		
		int dayweek = start.get(Calendar.DAY_OF_WEEK);
		// start 1일의 요일 번호 추출  :  일요일 1,  토요일 7
		
		System.out.println();
		System.out.println("========[" + month + "월]========");
		System.out.println("  일 월 화  수  목  금  토");
		
		for(int i=1; i<dayweek; i++) {
			System.out.print("   ");
		}
		// 요일 번호에 해당하는 만큼 공백 추가 (1자리에 3칸)
		
		
		for(int i=1, j = dayweek; i<=end.DATE; i++, j++) {
			System.out.printf("%3d", i);
			// 정렬을 위해 3자리 맞춰서 날짜 출력(2자리는 공백, 1자리는 날짜)
			
			if(j%7 == 0) {			   // 요일 번호가 7 == 토요일일라면 줄 바꿈
				System.out.println();
			}
		}
		
	}

}
