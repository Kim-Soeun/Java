package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {

		Parent parentA = new Child(); // �ڽ��� �θ�Ŭ������ �ڵ���ȯ -> �θ� �ڽ� Ÿ������ ������ȯ ����
		method1(parentA);
		
		Parent parentB = new Parent(); // �ڽ��� �θ�Ŭ������ �ڵ���ȯ x -> �θ� �ڽ� Ÿ������ ������ȯ x
		method1(parentB);
	}

	public static void method1(Parent parent) {
		
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("���� ��ȯ ����");
		} else {
			System.out.println("���� ��ȯ ����");
		}
		}
	
}
