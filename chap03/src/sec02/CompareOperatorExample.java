package sec02;

public class CompareOperatorExample {

	public static void main(String[] args) {

		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2==v3); // v2는 더블형태로 바뀌기 때문에 v2,v3 같이 비교 가능
		System.out.println(v2);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5); // false
		System.out.println((float)v4==v5); // true
		
		
	}

}
