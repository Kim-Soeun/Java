package sec01;

public class ResourceExample {

	public static void main(String[] args) {

		Class clazz = Car.class;		// Car ��ü ����
		
		String photo1 = clazz.getResource("a.jpg").getPath();
		String photo2 = clazz.getResource("images/dog.jpg").getPath();
		// getResource : ���ҽ��� ������ �� ����
		// getPath : ��� ������
		
		System.out.println(photo1);
		System.out.println(photo2);
		
	}

}
