package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Word {

	private String engWord;
	private String korWord;

	// �����ڸ� ���� ����� �ѱ� �ܾ� ������ �Է� ����
	public Word(String engWord, String korWord) {
		this.engWord = engWord;
		this.korWord = korWord;
	}

	public String getEngWord() { // ���� �ܾ� ���ϸ޼ҵ�
		return engWord;
	}

	public String getKorWord() { // �ѱ� �ܾ� ���ϸ޼ҵ�
		return korWord;
	}

}	
	
	
