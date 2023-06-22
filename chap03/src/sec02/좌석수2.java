package sec02;

import java.util.Scanner;

public class 좌석수2 {

	public static void main(String[] args) {

//		학생수 몇명?
//		한줄에 몇명씩 앉나요?
//		예) 총 학생수 24명, 한줄 5명
//		예) 총 5줄이고 남은 좌석수는 1개입니다
//		총 ~줄이고 남은 좌석수는 ~개 입니다

		Scanner s = new Scanner(System.in);
		System.out.println("학생수는 몇명인가요?");
		int student = s.nextInt();
		System.out.println("한줄에 몇명씩 앉나요?");
		int seat = s.nextInt();
		
		int line = student / seat; 
		int remainseat = student % seat;
		
		if (remainseat != 0) {
			++line;
			remainseat = seat - remainseat;
		} 	
		
		
		System.out.printf("총 %d줄이고 남은 좌석수는 %d개 입니다\n", line, remainseat);
		

	}

}
