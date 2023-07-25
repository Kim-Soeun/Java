package sec01;

public class IndexOfExample {

	public static void main(String[] args) {
		String str1 = "나는 자바를 사랑합니다";
		
		int index = str1.indexOf("사랑합니다");
		System.out.println(index); 		// 인덱스 시작 번호
		
		int index2 = str1.indexOf("코드");
		System.out.println(index2);     //-1 출력 : index2의 문자열이 str1에 속해있지 않음
		
	}

}
