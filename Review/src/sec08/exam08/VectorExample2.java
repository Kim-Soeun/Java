package sec08.exam08;

import java.util.*;

public class VectorExample2 {

	public static void main(String[] args) {

		// Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է¹޾�
		// ���Ϳ� �����ϰ� ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		
		List<Integer> list = new Vector<>();
		Scanner s = new Scanner(System.in);
		boolean run = true;
		
		
		
		while(run) {
			
		System.out.println("���ڸ� �Է��ϼ���");
		System.out.println("-1�� �Է��ϸ� ����ϴ�");
		int num = s.nextInt();
		list.add(num);
		if(num==-1) break;
		
		}
		
		int max = list.get(0);
		for(int i=1; i<list.get(i); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			} 
		}
		System.out.println("���� ū �� : " + max);
		
		
	}

}
