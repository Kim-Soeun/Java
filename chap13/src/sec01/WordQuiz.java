package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class WordQuiz {

	Scanner s = new Scanner(System.in);
	List<Word> list = new Vector<>();
	int[] question = new int[4];	// 문제 보기 저장할 배열은 4개로 지정

	
	
	public WordQuiz() {
		list.add(new Word("society", "사회"));
		list.add(new Word("friend", "친구"));
		list.add(new Word("pencil", "연필"));
		list.add(new Word("clock", "시계"));
		list.add(new Word("love", "사랑"));
		list.add(new Word("free", "자유"));
		list.add(new Word("vegetable", "야채"));
		list.add(new Word("problem", "문제"));
		list.add(new Word("wall", "벽"));
		list.add(new Word("trade", "무역"));
		list.add(new Word("fault", "잘못"));
}
	
	
	
	public void run() {
		System.out.println("누가누가 잘 맞추나 게임을 시작합니다");
		System.out.println("-1을 입력하면 종료합니다");
		System.out.println("현재 " + list.size() + "개의 단어가 들어 있습니다");
		System.out.println();
		
		int num = 0;
		// 맞춘 정답 개수를 저장하는 변수
		// 완성하고 나서 틀린 개수를 저장하는
		// 변수 추가해서 정답률 출력도 해보세요
		
		while(true) {
			randomQuiz(); // 랜덤한 값을 가진 문제 배열 생성 메소드 호출
			int answerNumber = (int) (Math.random() * question.length);
			// 0~3 중 한 값을 정답번호로 저장
			
			int answerIndex = question[answerNumber];
			// 정답번호의 배열에 있는 값이 정답
			
			System.out.println(list.get(answerIndex).getEngWord() + "?");
			// 정답의 영어단어를 호출해 문제로 출제함
			
			for(int i=0; i<question.length; i++) {
				// 4개의 보기를 만들기 위한 반복문
				System.out.println("(" + (i + 1) + ")" 
				+ list.get(question[i]).getKorWord() + " ");
				// 0~3까지 배열에 값을 넣어 각 인덱스의 보기 출력
			}
			System.out.println(">> ");
			
			
			
			int input = s.nextInt();
			if(input == -1) {
				System.out.println("지금까지 " + num + "개의 정답을 맞추었어요");
				System.out.println("게임을 종료합니다");
				break;
			} else if (input -1 == answerNumber) {
				System.out.println("정답입니다");
				System.out.println();
				num++;
			} else {
				System.out.println("오답입니다");
				System.out.println();
			}
		}
		
	}
	
	
	
		
		
		public void randomQuiz() {
			// 4개의 보기에 임의의 벡터 인덱스를 주기 위한 메소드
			for(int i=0; i<4; i++) {
				question[i] = (int) (Math.random() * list.size());
				// 0 ~ 문제의 개수(벡터의 사이즈) 중 임의의 값 저장 
				
				for(int j=0; j<i; j++) {	// 중복된 값은 없도록 처리
					if(question[i] == question[j]) {
						i--;
						continue;
					}
				}
			}
		}
		
		
		
		
		public static void main(String[] args) {

			WordQuiz wordQuiz = new WordQuiz();
			wordQuiz.run();
			
		}
   } 	
		
		
		

