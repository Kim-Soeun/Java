package sec02;

public class Ȯ�ι���2 {

	public static void main(String[] args) {

//		160p
//		for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��� ������.

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {   sum += i;        �̰͵� ����
			if (i % 3 != 0) {
				continue;
				
			}	sum += i;
		}
		System.out.println("1~100���� 3�� ����� �հ� : " + sum);

	}

}
