package sec03;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
//		Animal animal = new Animal();
//		추상 클래스는 객체 생성 x
		dog.sound();
		cat.sound();
		
		Animal animal = new Dog();
		animal.sound();		// 오버라이딩된 dog의 메소드 호출
		
		animalSound(new Dog());
	}
	
	// 매개변수가 Animal 타입 메소드
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
