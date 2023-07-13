package sec03;

public class SmartPhone extends Phone {
	
	int cost;	// 가격

	public SmartPhone(String owner, int cost) {
		super(owner);
		this.cost = cost;
	}
	
	public void internerSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}
