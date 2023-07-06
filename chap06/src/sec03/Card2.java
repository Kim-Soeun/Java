package sec03;

public class Card2 {

	private String cardName;
	
	public Card2(){
		this("현대");
	}
	
	public Card2(String cardName) {
		this.cardName = cardName;
	}

	public void getCard() {
		System.out.println("카드사는 " + this.cardName +"입니다");
	}
	
	public static void main(String[] args) {
		Card2 card2 = new Card2();
		Card2 card3 = new Card2("삼성");
		
		card2.getCard();
		card3.getCard();
		
	}

}
