package sec01;

public class ResourceExample {

	public static void main(String[] args) {

		Class clazz = Car.class;		// Car ��ü ����
		
		String photo1 = clazz.getResource("a.jpg").getPath();
		String photo2 = clazz.getResource("images/dog.jpg").getPath();
		// getResource : clazz Ŭ���� �ȿ� �ִ� �ڿ��� ������ �� ����
		// getPath : ��� ������
		
		System.out.println(photo1);
		System.out.println(photo2);
		
		String photo3 = clazz.getResource("a.jpg").getPath();
		String photo4 = clazz.getResource("dog.jpg").getPath();
		
		System.out.println(photo3);
		System.out.println(photo4);
		
	}

}
