package sec01;

public class iPhone {

	
	private String company;
	private int cost;
	private String model;
	
	
	

	public iPhone(String company, int cost, String model) {
		this.company = company;
		this.cost = cost;
		this.model = model;
	}



	@Override
	public String toString() {
		return company + "의 최신폰인 " + model + " 가격은 " + cost + "입니다";
		
	}
	
	
	
	
	
}
