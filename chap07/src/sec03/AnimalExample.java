package sec03;

public class AnimalExample {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
//		Animal animal = new Animal();
//		�߻� Ŭ������ ��ü ���� x
		dog.sound();
		cat.sound();
		
		Animal animal = new Dog();
		animal.sound();		// �������̵��� dog�� �޼ҵ� ȣ��
		
		animalSound(new Dog());
	}
	
	// �Ű������� Animal Ÿ�� �޼ҵ�
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}