package sec01;

public class �ζǹ�ȣ�ߺ����� {

	public static void main(String[] args) {

	int num = 0;	//��ȣ �ʱⰪ ����
	int[] lotto = new int [6];   // �ζ� ��ȣ�� �� �迭 ���� 
	boolean[] check = new boolean[46]; 		
	// ��ȣ�� ������ �Ǵ��ϴ� �迭 ����
	// 1~45�� �ʿ������� �迭�� 0���� �����ϹǷ� �� 46�� ����
	
	for(int i=0; i<lotto.length; i++) {	  // �� 6�� ���� ����
			
		num = (int)(Math.random()*45)+1;
		
		if (check[num]==false) {
			lotto[i] = num;
		}	else {
			i--;
		}	
	}
	
	for(int i=0; i<lotto.length; i++) {
		System.out.print(lotto[i] + " ");
	}
		
		
	}

}
