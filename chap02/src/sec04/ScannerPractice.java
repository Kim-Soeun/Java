package sec04;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {

//		도어락 비밀번호를 입력하세요
//		비밀번호 : 1234
//		만약 비밀번호를 잘못 입력했으면 -> 비밀번호가 틀립니다
//		제대로 입력했으면 -> 환영합니다
		
		Scanner s = new Scanner(System.in);
		String password;
		
		
		while(true) {
			System.out.println("도어락 비밀번호를 입력하세요");    //안내문자
			password = s.nextLine();    //입력받기
			
			if(password.equals("1234")) {    //입력받은 문자 확인하기
				System.out.println("환영합니다");
				break;
			}
				
			System.out.println("비밀번호가 틀립니다");
		}
			
		}
	}