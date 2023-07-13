package sec03;

public class Dog extends Animal {
	
	public Dog() {
		this.kind="포유류";
	}

	@Override
	public void sound() {
		System.out.println("강아지는 멍멍");
	}
//	상속 받은 하위클래스는 메소드를 재정의해야 한다
	
}
