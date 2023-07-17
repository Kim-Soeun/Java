package sec01;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;		// 인터페이스 변수 선언
		rc = new Television();  // 구현 객체를 대입
		rc = new Audio();
		
	}

}
