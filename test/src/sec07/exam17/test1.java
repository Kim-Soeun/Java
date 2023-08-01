package sec07.exam17;

public class test1 {

	public static void main(String[] args) {
		
		// 다음 2차원 배열을 출력하는 프로그램을 작성하시오.
		// 1
		// 123
		// 1
		// 1234
		// 12
		
		int[][] num = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		// 2중 배열에서 num.length는 줄수를 나타냄
		// num[i].length는 i번째 줄의 칸수
		for (int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]);
			} System.out.println();
		}
		
		
	}

}
