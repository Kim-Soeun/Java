package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Word {

	private String engWord;
	private String korWord;

	// 생성자를 통해 영어와 한글 단어 쌍으로 입력 받음
	public Word(String engWord, String korWord) {
		this.engWord = engWord;
		this.korWord = korWord;
	}

	public String getEngWord() { // 영어 단어 리턴메소드
		return engWord;
	}

	public String getKorWord() { // 한글 단어 리턴메소드
		return korWord;
	}

}	
	
	
