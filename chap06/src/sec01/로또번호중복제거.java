package sec01;

public class 로또번호중복제거 {

	public static void main(String[] args) {

	int num = 0;	//번호 초기값 세팅
	int[] lotto = new int [6];   // 로또 번호가 들어갈 배열 생성 
	boolean[] check = new boolean[46]; 		
	// 번호가 같은지 판단하는 배열 생성
	// 1~45가 필요하지만 배열은 0부터 시작하므로 총 46개 생성
	
	for(int i=0; i<lotto.length; i++) {	  // 총 6개 숫자 추출
			
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
