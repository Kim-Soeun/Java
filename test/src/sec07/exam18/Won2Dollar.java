package sec07.exam18;

import java.util.Scanner;

public class Won2Dollar extends Converter {

	abstract protected double convert(double src) {
		
	}

	abstract protected String getSrcString(); // �߻� �޼ҵ�

	abstract protected String getDestString(); // �߻� �޼ҵ�

	protected double ratio; // ����
	
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1�޷��� 1200��
		   toDollar.run();
	}

}
