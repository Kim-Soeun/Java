package sec01;

public class Notebook extends Computer {

	String cpu;
	double weight;
	String wifi;
	String bluetooth;
	String camera;
	
	Notebook(String wifi, String bluetooth, double weight) {
		this.wifi = wifi;
		this.bluetooth = bluetooth;
		this.weight = weight;
	}
	
	void kilogram(double weight) {
		System.out.println("무게는 " + weight + "kg 입니다");
	}
	
	String internet(String wifi) {
		String result = wifi + " 인터넷에 연결합니다";
		return result;
	}
	
	String connect(String bluetooth) {
		String result = bluetooth + " 연결";
		return result;
	}
	
	String disconnect(String bluetooth) {
		String result = bluetooth + " 연결해제";
		return result;
	}
	
}
