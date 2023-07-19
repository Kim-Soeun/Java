package sec07.exam18;

public class IPTV extends ColorTV{

	private String address;

	
	public IPTV(String address, int size, int cost) {
		super(size, cost);
		this.address = address;
	}
	
	public void printProperty() {
		System.out.print("IP¡÷º“ : " + address + ", ");
		super.printProperty();
	}
	
	
}
