package sec04;

public class GasCarExample {

	public static void main(String[] args) {

		GasCar myCar = new GasCar();
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("����մϴ�");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("������ ������ �ʿ䰡 �����ϴ�");
		}	else {
			System.out.println("������ �����ϼ���");
		}
	}

}