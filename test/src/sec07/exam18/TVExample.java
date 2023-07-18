package sec07.exam18;

public class TVExample {

	public static void main(String[] args) {

		ColorTV myTv = new ColorTV(55,100);
		myTv.printProperty();	
		
		IPTV iptv = new IPTV("192.168.0.250",55,200);
		iptv.printProperty();
	}

}
