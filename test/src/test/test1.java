package test;

public class test1 {

	public static void main(String[] args) {

		int[][] num = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		
		for (int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]);
			} System.out.println();
		}
		
		
	}

}
