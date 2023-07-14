package game;

public class 끝말잇기2 extends 끝말잇기 {

	public boolean check() {
		for (int j=0; j < playerNum; j++) {
			if (word[j].substring(word[j].length()-1).equals(word[j+1].substring(0))) {
				
			} else {
				System.out.println(players[j] + "이 졌습니다");
				break;
			}
	}
	
	
}
