package sec01;

public class switch연습2 {

	public static void main(String[] args) {

//		8~11 무작위로 선정
//		예) [현재시각 : 8시]
//		8시면 "출근합니다"
//		9시면 "회의를 합니다"
//		10시면 "업무를 봅니다"
//		"그 외 : 외근을 나갑니다"
		
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시각 : " + time + "시]");

		switch (time) {
		case 8:
			System.out.println("출근합니다");
			break;
		case 9:
			System.out.println("회의를 합니다");
			break;
		case 10:
			System.out.println("업무를 봅니다");
			break;
		default:
			System.out.println("그 외 : 외근을 나갑니다");
			break;
		}

	}

}
