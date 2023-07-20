package sec02;

public interface RemoteControl {		// 인터페이스 (상수 필드, 추상메소드 가짐)

	// 상수 필드(변수명 대문자, 값 필수로 넣어주기)
	String COMPANY="삼성";
	int COST=5000;
	
	// 추상메소드
	public void turnOn();
	public void turnOff();
	
	
}
