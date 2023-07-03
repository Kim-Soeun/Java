package sec02;

public class 향상된for문 {

	public static void main(String[] args) {

		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		for(int score : scores) { // 배열개수가 같을 때 적용됨
			sum +=score;
		}
		
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
		
		System.out.println("점수 총합 : " + sum);
		
		
	}

}
