package sec01;

public class 타입변환예외 {

	public static void main(String[] args) {

		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		// Animal 타입 변수에 대입된 객체가 Dog이므로 다시 Dog타입으로 변환하는 것은 문제 없음
		
		Animal animal2 = new Dog();
		Cat cat = (Cat) animal2;
		// 대입된 객체가 아닌 다른 클래스 타입으로 변환했기 때문에 오류
		
	}

}
