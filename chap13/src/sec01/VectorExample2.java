package sec01;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {

		// Scanner Ŭ������ -1�� �Էµ� ������ ���� ������ �Է¹޾�
		// ���Ϳ� �����ϰ� ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		
		List<Integer> list = new Vector<>();
		
		Scanner s = new Scanner(System.in);
		boolean run = true;
		
		
		
		while(run) {
			System.out.println("���ڸ� �Է��ϼ��� -1�� �Է��ϸ� ����ϴ�");
			int num = s.nextInt();
			if(num==-1) break;
			list.add(num);
		}
		
		
		int max = list.get(0);
		for(int i=1; i<list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			} 
		}	
		System.out.println("���� ū �� : " + max);	
		
		
	}

}
