package sec01;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {

		
		// 객체 문자 정보(toString())
		// '클래스이름@16진수해시코드'로 문자 정보 리턴
		
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		// Date 클래스의 toString은 현재 날짜와 시간 정보 출력
		
		
	}

}
