package sec02;

public class Ȯ�ι���3 {

	public static void main(String[] args) {

//		161p 3�� ����
//   	while���� Math.randon() �޼ҵ带 �̿��ؼ� 2���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ����ϰ�,
//		���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����. ���� ���� 5�� �Ǵ� ������
//		(1,4) (4,1) (2,3) (3,2) �Դϴ�.
		
		
		int sum;
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.print("�ֻ��� ����1 : " + num1);
			System.out.println(" �ֻ��� ����2 : " + num2);
			sum = num1 + num2;
			if(sum==5) {
				break;
			}
			
		}

	}

}
