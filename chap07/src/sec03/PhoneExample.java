package sec03;

public class PhoneExample {

	public static void main(String[] args) {

//		Phone phone = new Phone("ȫ�浿");	
//		�߻� Ŭ������ ���� ��ü ���� x
		
		SmartPhone smartphone = new SmartPhone("ȫ�浿", 1200000);
//		�ڽ� Ŭ������ ��ü ���� o
		smartphone.turnOn();	// �߻�Ŭ������ �޼ҵ�
		smartphone.internerSearch();	// ��ü �޼ҵ�
		
		
	}

}
