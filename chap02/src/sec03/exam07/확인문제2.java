package sec03.exam07;

public class Ȯ�ι���2 {

	public static void main(String[] args) {

//		9�� ����
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";

		int result = (int) (var1 + var2 + var3) + (int)Double.parseDouble(var4); //Double.parseDouble : ���ڸ� ���ڷ� �ٲ�
		System.out.println(result); // ��� 9
		
		int result2 = (int)var1 + (int)var2 + (int)var3 + (int)Double.parseDouble(var4);
		System.out.println(result2); // ��� 8
		
		int result3 = (int) (var1 + var2 + var3 + Double.parseDouble(var4));
		System.out.println(result3); // ��� 10
	}

}
