package game;

public class �����ձ�2 extends �����ձ� {

	public boolean check() {
		for (int j=0; j < playerNum; j++) {
			if (word[j].substring(word[j].length()-1).equals(word[j+1].substring(0))) {
				
			} else {
				System.out.println(players[j] + "�� �����ϴ�");
				break;
			}
	}
	
	
}
