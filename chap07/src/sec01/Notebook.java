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
		System.out.println("���Դ� " + weight + "kg �Դϴ�");
	}
	
	String internet(String wifi) {
		String result = wifi + " ���ͳݿ� �����մϴ�";
		return result;
	}
	
	String connect(String bluetooth) {
		String result = bluetooth + " ����";
		return result;
	}
	
	String disconnect(String bluetooth) {
		String result = bluetooth + " ��������";
		return result;
	}
	
}
