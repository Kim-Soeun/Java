package sec01;

public interface RemoteControl {
// 인터페이스는 객체로 생성할 수 없기 때문에 생성자 가질 수 x
// 상수 필드, 추상 메소드로 구성

//	public int s = 3;	
// 인터페이스 필드 : 위는 올바른 사용 방법 아님
// 인터페이스 필드는 상수 필드만 사용 가능하므로
// 필드 이름을 대문자로 쓰는 것이 관례임

	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 10;
	
//	public String NAME;
// 상수 필드는 반드시 초기값을 넣어야 함
	public String NAME="홍길동";
	
	void turnOn();
	void turnOff();
	public void setVolume(int volume);
//	인터페이스 메소드는 추상 메소드로 구현함
	
}