package sec03;

public class Card2 {

	private String cardName;
	
	public Card2(){
		this("����");
	}
	
	public Card2(String cardName) {
		this.cardName = cardName;
	}

	public void getCard() {
		System.out.println("ī���� " + this.cardName +"�Դϴ�");
	}
	
	public static void main(String[] args) {
		Card2 card2 = new Card2();
		Card2 card3 = new Card2("�Ｚ");
		
		card2.getCard();
		card3.getCard();
		
	}

}
