package sec01;

import java.util.Scanner;

public class ReplaceExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String address = s.nextLine();		
		// .nextLine() : enter 포함한 모든 문자열
		// .next() : space 전 문자열(한 단어)
		String addressNew = address.replace("광주", "광주광역시");
		// replacefirst() : 한글자나 한단어만 교체
		System.out.println(addressNew);
		
		
	}

}
