package sec07.exam17;

public class test1 {

	public static void main(String[] args) {
		
		// ���� 2���� �迭�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// 1
		// 123
		// 1
		// 1234
		// 12
		
		int[][] num = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		// 2�� �迭���� num.length�� �ټ��� ��Ÿ��
		// num[i].length�� i��° ���� ĭ��
		for (int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]);
			} System.out.println();
		}
		
		
	}

}
