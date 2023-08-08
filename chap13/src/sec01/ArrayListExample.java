package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {

		// Scanner 클래스를 사용하여 학점('A', 'B', 'C', 'D', 'F')을 6번 문자로 입력받아
		// ArrayList에 저장하고, ArrayList를 검색하여 학점을
		// 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
		// 평균을 출력하는 프로그램을 작성하세요
		
		List<Character> list = new ArrayList<>();
//		ArrayList list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("학점을 6번 입력하세요");
		System.out.println("A B C D F 중 선택해서 한 칸 띄우고 입력하세요");
		
		for(int i=0; i<6; i++) {
			char grade = s.next().charAt(0);
			list.add(grade);
		}
		
		
		double sum = 0;			// 4.0이기 때문에 double로 받음
		double average = 0;
		
		for(int i=0; i<list.size(); i++) {
			switch(list.get(i)) {
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
		
		average = sum / 6;
		System.out.println("평균 점수 : " + average);
		
		
		
	}

}
