package sec02.exam01;

public class 리터럴연습2 {

	public static void main(String[] args) {
		byte var1 = 115;
		byte var2 = 0;
		// byte var3 = 127; byte  수 표현 범위를 벗어남
		byte var3 = 127;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		long var4 = 12345678;
		// long var5 = 1000000000000; 기본으로 인식하는 int 범위를 벗어남
		long var6 = 1000000000000L;
		System.out.println(var4);
		// System.out.println(var5);
		System.out.println(var6);
		
	}
}
