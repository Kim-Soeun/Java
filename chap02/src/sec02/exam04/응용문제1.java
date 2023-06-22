package sec02.exam04;

public class 응용문제1 {

	public static void main(String[] args) {
		System.out.println("1" + "2");
		System.out.println(true + ""); // ""를 붙이면 앞 단어를 문자열로 인식해서 단어로 출력됨
		System.out.println('A' + 'B');
		System.out.println('1' + 2); // char + int = int
		System.out.println('1' + '2'); 
		System.out.println('J' + "ava"); //char + string = string
		// System.out.println(true + null); 결과 안 나옴
		
		boolean var = true; // 논리타입은  값에 true, false를 써야함
		System.out.println(var);
		
		float v2 = 1e2F; //71p 2-9번 문제
		System.out.println(v2);
		
		System.out.println("자바는"); // 71p 3번문제
		System.out.println("\n 재미있는 \"프로그래밍\" 언어\n");
		System.out.println("입니다.");
		
	}

}
