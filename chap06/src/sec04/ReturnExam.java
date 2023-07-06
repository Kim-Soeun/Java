package sec04;

public class ReturnExam {

		int plus(int x, int y) {
		int result = x+y;
		return result;
	}

		int plus2(int x, int y) {
			byte result = (byte) (x+y);
			return result;
		}
		
		public static void main(String[] args) {
			ReturnExam reExam = new ReturnExam();
			int result1 = reExam.plus2(200, 300);
			System.out.println(result1);
			
			int result2 = reExam.plus2(200, 300);
			System.out.println(result2);
//			byte는 int로 결과가 나올 수 있지만 
//			숫자가 넘어가게 되면 올바르게 나오지 x
		}
	}
