package sec08.exam14;

import java.util.*;

public class VectorExample2 {

	public static void main(String[] args) {

		// Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է¹޾�
		// ���Ϳ� �����ϰ� ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���
	
		Scanner s = new Scanner(System.in);
		List<Integer> list = new Vector<>();
		
		
		while(true) {
			System.out.println("���� ������ �Է��ϼ���");
			System.out.println("-1�� �Է��ϸ� ����ϴ�");
			int num = s.nextInt();
			if(num == -1) break;
			list.add(num);
		}
		
		
		int max = list.get(0);
		for(int i=1; i<list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("���� ū �� : " + max);
		
	}

}
