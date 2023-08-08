package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class WordQuiz {

	Scanner s = new Scanner(System.in);
	List<Word> list = new Vector<>();
	int[] question = new int[4];	// ���� ���� ������ �迭�� 4���� ����

	
	
	public WordQuiz() {
		list.add(new Word("society", "��ȸ"));
		list.add(new Word("friend", "ģ��"));
		list.add(new Word("pencil", "����"));
		list.add(new Word("clock", "�ð�"));
		list.add(new Word("love", "���"));
		list.add(new Word("free", "����"));
		list.add(new Word("vegetable", "��ä"));
		list.add(new Word("problem", "����"));
		list.add(new Word("wall", "��"));
		list.add(new Word("trade", "����"));
		list.add(new Word("fault", "�߸�"));
}
	
	
	
	public void run() {
		System.out.println("�������� �� ���߳� ������ �����մϴ�");
		System.out.println("-1�� �Է��ϸ� �����մϴ�");
		System.out.println("���� " + list.size() + "���� �ܾ ��� �ֽ��ϴ�");
		System.out.println();
		
		int num = 0;
		// ���� ���� ������ �����ϴ� ����
		// �ϼ��ϰ� ���� Ʋ�� ������ �����ϴ�
		// ���� �߰��ؼ� ����� ��µ� �غ�����
		
		while(true) {
			randomQuiz(); // ������ ���� ���� ���� �迭 ���� �޼ҵ� ȣ��
			int answerNumber = (int) (Math.random() * question.length);
			// 0~3 �� �� ���� �����ȣ�� ����
			
			int answerIndex = question[answerNumber];
			// �����ȣ�� �迭�� �ִ� ���� ����
			
			System.out.println(list.get(answerIndex).getEngWord() + "?");
			// ������ ����ܾ ȣ���� ������ ������
			
			for(int i=0; i<question.length; i++) {
				// 4���� ���⸦ ����� ���� �ݺ���
				System.out.println("(" + (i + 1) + ")" 
				+ list.get(question[i]).getKorWord() + " ");
				// 0~3���� �迭�� ���� �־� �� �ε����� ���� ���
			}
			System.out.println(">> ");
			
			
			
			int input = s.nextInt();
			if(input == -1) {
				System.out.println("���ݱ��� " + num + "���� ������ ���߾����");
				System.out.println("������ �����մϴ�");
				break;
			} else if (input -1 == answerNumber) {
				System.out.println("�����Դϴ�");
				System.out.println();
				num++;
			} else {
				System.out.println("�����Դϴ�");
				System.out.println();
			}
		}
		
	}
	
	
	
		
		
		public void randomQuiz() {
			// 4���� ���⿡ ������ ���� �ε����� �ֱ� ���� �޼ҵ�
			for(int i=0; i<4; i++) {
				question[i] = (int) (Math.random() * list.size());
				// 0 ~ ������ ����(������ ������) �� ������ �� ���� 
				
				for(int j=0; j<i; j++) {	// �ߺ��� ���� ������ ó��
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
		
		
		

