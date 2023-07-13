package sec03;

public class Cat extends Animal {
	
	public Cat() {
		this.kind="포유류";
	}

	@Override
	public void sound() {
		System.out.println("고양이는 야옹");
	}
//	상속 받은 하위클래스는 메소드를 재정의해야 한다
	
}
