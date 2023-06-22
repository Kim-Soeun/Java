package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		// throws Exception은 예외상황을 화면에 출력함
		
		int keyCode;
		keyCode = System.in.read();
		System.out.println("키코드 : " + keyCode); // t 입력 -> 키코드 : 116출력됨
		keyCode = System.in.read();
		System.out.println("키코드 : " + keyCode); // 키코드 : 13 -> Enter를 인식해서 출력한 결과
		keyCode = System.in.read();
		System.out.println("키코드 : " + keyCode); //키코드 : 10

		while(true) {    // 무한 반복문
			keyCode = System.in.read();
			System.out.println("키코드 : " + keyCode);
		}
//			가 (입력)
//			키코드 : 176
//			키코드 : 161
//			키코드 : 13
//			키코드 : 10
			
			
		}
	}


