package sec01;

public class ClassExample {

	public static void main(String[] args) throws Exception {

		
		Key key = new Key(50);
		Class clazz = key.getClass();
		
		System.out.println(clazz.getName());  // ��Ű�� + Ŭ���� �̸� ���
		
		Class clazz2 = Member.class;
		System.out.println(clazz2.getSimpleName()); // Ŭ���� �̸� ���
	}

}
