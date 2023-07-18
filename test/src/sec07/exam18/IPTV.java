package sec07.exam18;

public class IPTV extends ColorTV{

	private String address;

	
	public IPTV(String address, int size, int cost) {
		super(size, cost);
		this.address = address;
	}
	
	public void printProperty() {
		System.out.println("IP주소 : " + address + ", "+ getSize() + "인치, " + cost + "만원");
	}
	
	
}
