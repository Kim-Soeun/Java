package sec01;

import java.util.Scanner;

public class IndexOfExample2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String address = s.next();
		
		if(address.indexOf("문흥") != -1 || address.indexOf("두암") != -1 || address.indexOf("운암") != -1 || address.indexOf("용봉") != -1) {
			System.out.println("북구 거주민입니다");
		} else {
			System.out.println("북구 거주민이 아닙니다");
		}
		
		
	}

}
