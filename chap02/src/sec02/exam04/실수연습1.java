package sec02.exam04;

public class 실수연습1 {

	public static void main(String[] args) {
		// float var1 = 3.14; float 타입은 반드시 뒤에 f를 붙여야 함.
		float var1 = 3.14f;
		double var2 = 3.14;
		
		System.out.println(var1);
		System.out.println(var2);
		
		float var3 = 0.1234567890123456789f; 
		double var4 = 0.1234567890123456789;
		
		System.out.println(var3); // 반올림되어 결과가 나옴
		System.out.println(var4);
		
		float var5 = 0.1234567810123456789f;
		System.out.println(var5);
		
		double var6 = 3e6; // e뒤에 숫자는 0의 개수
		float var7 =3e6f;  
		double var8 = 2e-3; // e뒤에 -숫자는 소수점 뒤 자리개수
		double var9 = 237e-4;
		
		System.out.println(var6); 
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	
	}

}
