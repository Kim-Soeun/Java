package test;

import java.util.Scanner;

public class �����ձ�2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���ӿ� �����ϴ� �ο��� �Է��ϼ���");
		int num = s.nextInt();
		String[] players = new String [num];
		
		for(int i=0; i<num; i++) {
			System.out.println("�������� �̸��� �Է��ϼ���");
			players[i] = s.next();
		}
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�");
		
		
		String word1 = "�ƹ���";
		
		
		while(true) {
			
			
			for (int j=0; j<num; j++) {
				
				System.out.print(players[j] + ">> ");
				String word2 = s.next();
			
			if(word1.charAt(word1.length()-1)==word2.charAt(0)) {
				word1 = word2;
			} else {
				System.out.println(players[j] + "���� �����ϴ�");
				break;
			}
			
			
			}
		
		
	}
		
		
	}

}
