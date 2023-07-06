package sec04;

public class GasCar {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
		System.out.println("가스가 5만큼 충전되었습니다");
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("달립니다.(가스잔량:" + gas + ")");
				gas -= 1;
			}	else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; //반복문 중지하는 효과
			}
		}
	}
}
