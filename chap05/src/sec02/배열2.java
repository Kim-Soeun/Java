package sec02;

public class �迭2 {

	public static void main(String[] args) {

	int[] d = {52,87,94,77,69};
	int sum = 0;
	
	// �迭�� ��ü �հ�� ����� ���ϼ���
	// ����� double Ÿ������
	// for
	
	for(int i=0; i<=4; i++) {
		sum += d[i];
	}	System.out.println("��ü �հ� : " + sum);
		double average = (double) sum/5; // double�� ������ȯ ����� �Ҽ��� ���ڸ����� ����
		System.out.println("��� : " + average);
		
		int[] t;
//		t = {1,2,3};  ������ ���� �߻�
		
		int[] s = null;
		s= new int[] {1,2,3};  // ����Ÿ���̱� ������ �迭 ������ �̸� �����ϰ� �� ��ϵ��� ���߿� ������ �� new�� �ٿ���
		
		int[] p = new int[] {1,2,3};
		int[] q = {4,5,6}; 
		
		
		
	}

}
