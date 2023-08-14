package sec08.exam14;

import java.util.*;

public class ArrayLilstExample {

	public static void main(String[] args) {

		// Scanner 클래스를 사용하여 학점('A', 'B', 'C', 'D', 'F')을 6번 문자로 입력받아
		// ArrayList에 저장하고, ArrayList를 검색하여 학점을
		// 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
		// 평균을 출력하는 프로그램을 작성하세요

		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		
		System.out.println("A, B, C, D, F 중 선택해서 6번 입력하세요");
		for(int i=0; i<6; i++) {
		char grade = s.next().charAt(0);
		list.add(grade);
		}
		
		
		double sum=0.0;
		
		for(int i=0; i<list.size(); i++) {
			char score = list.get(i);
			
			switch (score) {
			case 'A': case 'a':
				sum += 4.0;
				break;
			case 'B': case 'b':
				sum += 3.0;
				break;
			case 'C': case 'c':
				sum += 2.0;
				break;
			case 'D': case 'd':
				sum += 1.0;
				break;
			case 'F': case 'f':
				break;
			
			}
		}
		double average = sum / list.size();
		System.out.println("평균 : " + average);
	
		
	}

}
