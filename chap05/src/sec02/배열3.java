package sec02;

public class 배열3 {

	public static void main(String[] args) {

		int[] scores;
		scores = new int[] { 83, 90, 87 };

		// int[] scores = {83,90,87}; 압축해서 사용 가능함

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];

		}
		System.out.println("총합 : " + sum1);
		
		
		
		int sum2 = add( new int[] {83,90,87} );
		System.out.println("총합 : " + sum2);
		System.out.println();
	}	// main 구문 끝남
	
	public static int add(int[] scores) {  //  public static 뒤 int는 정수 값을 준다는 의미
		int sum=0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
