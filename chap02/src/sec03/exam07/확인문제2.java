package sec03.exam07;

public class 확인문제2 {

	public static void main(String[] args) {

//		9번 문제
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";

		int result = (int) (var1 + var2 + var3) + (int)Double.parseDouble(var4); //Double.parseDouble : 문자를 숫자로 바꿈
		System.out.println(result); // 결과 9
		
		int result2 = (int)var1 + (int)var2 + (int)var3 + (int)Double.parseDouble(var4);
		System.out.println(result2); // 결과 8
		
		int result3 = (int) (var1 + var2 + var3 + Double.parseDouble(var4));
		System.out.println(result3); // 결과 10
	}

}
