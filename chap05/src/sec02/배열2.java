package sec02;

public class 배열2 {

	public static void main(String[] args) {

	int[] d = {52,87,94,77,69};
	int sum = 0;
	
	// 배열의 전체 합계와 평균을 구하세요
	// 평균은 double 타입으로
	// for
	
	for(int i=0; i<=4; i++) {
		sum += d[i];
	}	System.out.println("전체 합계 : " + sum);
		double average = (double) sum/5; // double로 강제변환 해줘야 소수점 뒷자리까지 나옴
		System.out.println("평균 : " + average);
		
		int[] t;
//		t = {1,2,3};  컴파일 에러 발생
		
		int[] s = null;
		s= new int[] {1,2,3};  // 참조타입이기 때문에 배열 변수를 미리 선언하고 값 목록들이 나중에 결정될 땐 new를 붙여줌
		
		int[] p = new int[] {1,2,3};
		int[] q = {4,5,6}; 
		
		
		
	}

}
