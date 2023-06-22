package sec04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

//		문자열 입력 했을 때 무한반복 출력
//		q 입력하면 "종료"뜨면서 멈춤
//		ex) 입력된 문자열: "가나다라마바"

		Scanner scanner = new Scanner(System.in);
		String inputData;

		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: " + inputData + "\"");
			if (inputData.equals("q")) { // equlas : 문자열을 어떤 것과 같다고 할 때 쓰는 것
				break; // q 입력하면 무한반복 멈춤
			}

		}
		System.out.println("종료");
	}

}
