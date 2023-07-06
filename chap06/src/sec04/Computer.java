package sec04;

public class Computer {

//	 배열의 전체 숫자 합계 구하기
		int sum1(int[] values) {
			int sum = 0;
			for(int i=0; i<values.length; i++) {
				sum += values[i];
			}
			return sum;
		}
		
		public static void main(String[] args) {
			Computer myCom = new Computer();
			int[] values1 = {1,2,3};
			int result1 = myCom.sum1(values1);
			System.out.println(result1);
			
//			위와 아래 같음
			
			int result2 = myCom.sum1(new int[] {1,2,3});
			System.out.println(result2);
		}
}
