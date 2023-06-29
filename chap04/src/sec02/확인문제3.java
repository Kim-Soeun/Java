package sec02;

public class 확인문제3 {

	public static void main(String[] args) {

//		161p 3번 문제
//   	while문과 Math.randon() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
//		눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은
//		(1,4) (4,1) (2,3) (3,2) 입니다.
		
		
		int sum;
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.print("주사위 숫자1 : " + num1);
			System.out.println(" 주사위 숫자2 : " + num2);
			sum = num1 + num2;
			if(sum==5) {
				break;
			}
			
		}

	}

}
